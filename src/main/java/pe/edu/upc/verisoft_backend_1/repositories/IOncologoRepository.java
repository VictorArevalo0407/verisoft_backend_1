package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IOncologoRepository extends JpaRepository<Oncologo,Integer> {
    @Query(value = "select o.nombreyapellido, count(c.id_cita), c.fecha\n" +
            "from cita c\n" +
            "inner join oncologo o on o.oncologo_id = c.oncologo_id \n" +
            "where c.fecha = :fechaingresada "+
            "group by o.oncologo_id, c.fecha",nativeQuery = true)
    public List<String[]> cantidaddecitasdeoncologosporfechas(LocalDate fechaingresada);

    @Query(value = "SELECT o.nombreyapellido, AVG(c.estrellas) as promedioestrellas \n" +
            "FROM oncologo o \n" +
            "JOIN comentario c ON o.oncologo_id = c.oncologo_id \n" +
            "GROUP BY o.oncologo_id, o.nombreyapellido",nativeQuery = true)
    public List<String[]> promediodeestrellasporoncologo();
}
