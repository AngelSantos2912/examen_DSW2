package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.model.db;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "personaje")

public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersonaje;
    private String nompersonaje;
    private String apepersonaje;
    private String fechaNacimiento;
}
