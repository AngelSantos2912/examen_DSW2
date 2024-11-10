package pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.S2_SANTOS_ANGEL.ws_soap_bd.model.db.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer> {

}
