package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Alergias;

import java.util.List;

@Repository
public interface IAlergiasRepository extends JpaRepository<Alergias,Integer>{
    @Query(value = "Select p.id_paciente as paciente, count(*) as cantidad \n" +
            "from Paciente p inner join Alergias a on \n" +
            "p.id_paciente= a.idalergias \n" +
            "group by p.id_paciente  ", nativeQuery = true)
    public List<String[]> quantityAlergiasByPaciente();
}
