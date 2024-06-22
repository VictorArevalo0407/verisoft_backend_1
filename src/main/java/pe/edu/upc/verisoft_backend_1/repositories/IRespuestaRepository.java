package pe.edu.upc.verisoft_backend_1.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IRespuestaRepository extends JpaRepository<Respuesta,Integer> {

        //Query 1
        //Cantidad total de respuestas por estado de paciente
        @Query("from Respuesta r where r.paciente.estado=:estado")
        public List<Respuesta>listRespuestaEstado(@Param("estado") String estado);

        //Query 2
        //Cantidad total de respuestas por estado de paciente
        @Query("from Respuesta r where r.gradoConsulta=:grado")
        public List<Respuesta>listaRespuestaGrado(@Param("grado") String grado);


}
