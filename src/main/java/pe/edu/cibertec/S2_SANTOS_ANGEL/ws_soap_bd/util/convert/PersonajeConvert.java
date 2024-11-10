package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.util.convert;

import org.springframework.stereotype.Component;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.model.db.Personaje;
import pe.edu.cibertec.ws.objects.Personajesoap;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonajeConvert {

        public Personaje convertPersonajeBD(Personajesoap personajesoap) {
            Personaje personaje = new Personaje();
            personaje.setIdPersonaje(personajesoap.getId());
            personaje.setApepersonaje(personajesoap.getApellidoPersonaje());
            personaje.setFechaNacimiento(personajesoap.getNacimiento());
            return personaje;
        }

        public Personajesoap convertPersonajesoap(Personaje personaje) {
            Personajesoap personajesoap = new Personajesoap();
            personajesoap.setId(personaje.getIdPersonaje());
            personajesoap.setNombrePersonaje(personaje.getNompersonaje());
            personajesoap.setApellidoPersonaje(personaje.getApepersonaje());
            personajesoap.setNacimiento(personaje.getFechaNacimiento());
            return personajesoap;
        }

        public List<Personaje> convertPersonajeBdList(List<Personajesoap> personajesoaps) {
            List<Personaje> list = new ArrayList<>();
            for (Personajesoap personajesoap : personajesoaps) {
                list.add(convertPersonajeBD(personajesoap));
            }
            return list;
        }

        public List<Personajesoap> convertPersonajeSoapList(List<Personaje> personajes) {
            List<Personajesoap> list = new ArrayList<>();
            for (Personaje personaje : personajes) {
                list.add(convertPersonajesoap(personaje));
            }
            return list;
        }

    }









