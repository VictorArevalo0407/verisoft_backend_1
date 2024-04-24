package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;

import java.util.List;

//Cantidad de respuestas totales por paciente en estado activo
@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta,Integer> {
}
