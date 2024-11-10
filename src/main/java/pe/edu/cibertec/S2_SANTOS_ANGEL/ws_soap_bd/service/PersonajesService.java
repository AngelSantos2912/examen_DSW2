package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.service;

import pe.edu.cibertec.ws.objects.GetListPersonajeResponse;
import pe.edu.cibertec.ws.objects.GetPersonajeResponse;
import pe.edu.cibertec.ws.objects.PostPersonajeRequest;
import pe.edu.cibertec.ws.objects.PostPersonajeResponse;

public interface PersonajesService {
    GetListPersonajeResponse obtenerPersonajes();

    GetPersonajeResponse obtenerPersonaje(int id);

    PostPersonajeResponse guardarPersonaje(PostPersonajeRequest personaje);
}
