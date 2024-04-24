package pe.edu.upc.verisoft_backend_1.repositories;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;

import java.util.List;
//Cantidad de respuestas  por paciente con estado activo
@Repository
public interface IPacienteRepository extends JpaRepository<Paciente,Integer> {
    @Query(value = "SELECT p.id_paciente AS paciente, COUNT(*) AS cantidad_respuestas \n" +
            "FROM Paciente p \n" +
            "INNER JOIN Respuesta r ON p.respuesta_id = r.id_respuesta \n" +
            "WHERE p.estado = 'Y' \n" +
            "GROUP BY p.id_paciente ",nativeQuery = true)
    public List<String[]> quantityRespuestasByStatus();

//Cantidad de usuarios con grado de consulta critico
    @Query(value = "SELECT u.id AS usuario, COUNT(r.id_respuesta) AS cantidad_respuestas\n " +
            "FROM Users u\n " +
            "INNER JOIN Paciente p ON u.id = p.user_id\n " +
            "INNER JOIN Respuesta r ON p.respuesta_id = r.id_respuesta\n " +
            "WHERE r.grado_consulta = 'critico'\n " +
            "GROUP BY u.id;\n ",nativeQuery = true)
    public List<String[]> totalUsuariosporGrado();
}
