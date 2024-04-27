package pe.edu.upc.verisoft_backend_1.servicesimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;
import pe.edu.upc.verisoft_backend_1.repositories.IRespuestaRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IRespuestaService;

import java.util.List;

@Service
public class RespuestaServiceImplement implements IRespuestaService {
    @Autowired
    private IRespuestaRepository rR;
    @Override
    public void insert(Respuesta respuesta) {
        rR.save(respuesta);
    }
    @Override
    public List<Respuesta> list() {
        return rR.findAll();
    }
    @Override
    public List<String[]> quantityRespuestasByPacienteAndGrado() {

        return rR.quantityRespuestasByPacienteAndGrado();
    }
    @Override
    public List<String[]> quantityRespuestasByPacienteEstadoAndGrado() {

        return rR.quantityRespuestasByPacienteEstadoAndGrado();
    }
}
