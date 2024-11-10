package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.enpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.service.IPersonajeService;
import pe.edu.cibertec.ws.objects.*;

public class PersonajeEndPoint {

    @Endpoint
    public class PersonajesEndPoint {
        private static final String NAMESPACE_URI = "http://www.cibertec.edu.pe/ws/objects";

        @Autowired
        private IPersonajeService personajeService;

        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getListPersonajeRequest")
        @ResponsePayload
        public GetListPersonajeResponse getListPersonajes(@RequestPayload GetListPersonajeRequest getListPersonajeRequest){
            return personajeService.obtenerpersonajes();
        }

        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonajeRequest")
        @ResponsePayload
        public GetPersonajeResponse getPersonajeResponse(@RequestPayload GetPersonajeRequest request) {
            return personajeService.obtenerpersonaje(request.getId());
        }

        @PayloadRoot(namespace = NAMESPACE_URI, localPart = "postPersonajeRequest")
        @ResponsePayload
        public PostPersonajeResponse postPersonajeResponse(@RequestPayload PostPersonajeRequest request) {
            return personajeService.guardarpersonaje(request);
        }
    }





}
