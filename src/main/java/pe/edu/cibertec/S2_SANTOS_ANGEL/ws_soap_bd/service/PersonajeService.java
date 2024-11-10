package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.model.db.Personaje;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.repository.PersonajeRepository;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.util.convert.PersonajeConvert;
import pe.edu.cibertec.ws.objects.GetListPersonajeResponse;
import pe.edu.cibertec.ws.objects.GetPersonajeResponse;
import pe.edu.cibertec.ws.objects.PostPersonajeRequest;
import pe.edu.cibertec.ws.objects.PostPersonajeResponse;

@RequiredArgsConstructor
@Service
public class PersonajeService implements PersonajesService {

        private final PersonajeRepository personajeRepository;
        private final PersonajeConvert personajeConvert;

        @Override
        public GetListPersonajeResponse obtenerPersonajes() {
            GetListPersonajeResponse response = new GetListPersonajeResponse();
            response.getListPersonajes().addAll(personajeConvert.convertPersonajeSoapList(personajeRepository.findAll()));
            return response;
        }

        @Override
        public GetPersonajeResponse obtenerPersonaje(int id) {
            GetPersonajeResponse response = new GetPersonajeResponse();
            Personaje personaje = personajeRepository.findById(id).orElse(null);
            if (personaje != null) {
                response.setPersonaje(personajeConvert.convertPersonajesoap(personaje));
            }
            return response;
        }

        @Override
        public PostPersonajeResponse guardarPersonaje(PostPersonajeRequest personaje) {
            PostPersonajeResponse response = new PostPersonajeResponse();
            Personaje nuevoPersonaje = personajeRepository.save(personajeConvert.convertPersonajeBD(personaje.getPersonaje()));
            response.setPersonaje(personajeConvert.convertPersonajesoap(nuevoPersonaje));
            return response;
        }
    }


