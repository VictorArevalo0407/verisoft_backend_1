package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Cita;

import java.util.List;

@Repository
public interface ICitaRepository extends JpaRepository<Cita,Integer> {
    @Query(value = "select m.nombreyapellido as Oncologo, count(*) as cantidad \n" +
            "from Oncologo m inner join Cita c on \n" +
            "m.oncologo_id= c.oncologo_id \n" +
            "group by m.nombreyapellido ",nativeQuery = true)

    public List<String[]> quantityCitasByOncologo();

}
