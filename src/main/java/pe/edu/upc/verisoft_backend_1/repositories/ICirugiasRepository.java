package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.Cirugias;

import java.util.List;


@Repository
public interface ICirugiasRepository extends JpaRepository<Cirugias, Integer> {
    @Query(value = "select p.id_paciente as paciente, count(*) as cantidad \n" +
            "from Paciente p inner join Cirugias c on \n" +
            "p.id_paciente= c.idcirugias \n" +
            "group by p.id_paciente ", nativeQuery = true)
    public List<String[]> quantityCirugiasByPaciente();


}
