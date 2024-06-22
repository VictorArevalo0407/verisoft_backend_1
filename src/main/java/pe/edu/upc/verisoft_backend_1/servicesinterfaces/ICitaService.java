package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.verisoft_backend_1.entities.Cita;
import pe.edu.upc.verisoft_backend_1.entities.Comentario;
import pe.edu.upc.verisoft_backend_1.entities.Seguro;

import java.util.List;

public interface ICitaService {
    public void insert(Cita cita);

    public List<Cita> list();

    public void delete(int id);

    public List<String[]> quantityCitasByOncologo();

    public List<Cita> listCitaa(String nombreyapellido);
    public Cita listarId(int idCita);

}
