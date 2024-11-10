package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class PersonajeWsdlConfig {

    @Bean(name = "personajes")
    public DefaultWsdl11Definition personajeWsdl(XsdSchema personajeEsquema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("PersonajePort");
        wsdl11Definition.setLocationUri("/ws/personaje");
        wsdl11Definition.setTargetNamespace("http://www.cibertec.edu.pe/ws/objects");
        wsdl11Definition.setSchema(personajeEsquema);
        return wsdl11Definition;
    }
    @Bean
    public XsdSchema personajeEsquema() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/personaje.xsd"));
    }
}


