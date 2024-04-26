package pe.edu.upc.verisoft_backend_1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;

import java.util.List;

    //Query 1
    //Cantidad total de respuestas por grado de consulta para cada paciente
@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta,Integer> {

        //Query 2
        //Cantidad total de respuestas por grado de consulta y estado para cada paciente
    }