package pe.edu.upc.verisoft_backend_1.servicesinterfaces;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;

import java.util.List;

public interface IRespuestaService {
    public void insert(Respuesta respuesta);
    public List<Respuesta> list();
}

