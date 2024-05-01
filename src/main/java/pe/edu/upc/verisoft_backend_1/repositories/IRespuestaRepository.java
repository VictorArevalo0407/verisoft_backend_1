package pe.edu.upc.verisoft_backend_1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;

import java.util.List;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta,Integer> {

        //Query 1
        //Cantidad total de respuestas por grado de consulta para cada paciente
        @Query(value = "SELECT paciente_id, grado_consulta, COUNT(*) AS cantidad_total_respuestas\n" +
                "FROM respuesta\n" +
                "GROUP BY paciente_id, grado_consulta" , nativeQuery = true)
        public List<String[]> quantityRespuestasByPacienteAndGrado();

        //Query 2
        //Cantidad total de respuestas por grado de consulta y estado para cada paciente
        @Query(value = "SELECT p.id_paciente, p.estado, MAX(r.grado_consulta) as grado_consulta_max, sub.cantidad_total_respuestas\n" +
                "FROM paciente p JOIN (SELECT paciente_id, COUNT(*) AS cantidad_total_respuestas FROM Respuesta\n" +
                "GROUP BY paciente_id) sub ON p.id_paciente = sub.paciente_id\n" +
                "LEFT JOIN Respuesta r ON p.id_paciente = r.paciente_id\n" +
                "GROUP BY p.id_paciente, p.estado, sub.cantidad_total_respuestas" , nativeQuery = true)
        public List<String[]> quantityRespuestasByPacienteEstadoAndGrado();
    }