package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;
import pe.edu.upc.verisoft_backend_1.repositories.IPacienteRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IPacienteService;

import java.util.List;
@Service
public class PacienteServiceImplement implements IPacienteService {
    @Autowired
    private IPacienteRepository pR;
    @Override
    public void insert(Paciente paciente) {
    pR.save(paciente);
    }
    @Override
    public List<Paciente> list() {
        return pR.findAll();
    }

}
