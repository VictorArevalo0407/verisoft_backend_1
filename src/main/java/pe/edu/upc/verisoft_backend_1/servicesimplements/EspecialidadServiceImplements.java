package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import pe.edu.upc.verisoft_backend_1.repositories.IEspecialidadRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IEspecialidadService;

import java.util.List;

@Service
public class EspecialidadServiceImplements implements IEspecialidadService {
    @Autowired
    private IEspecialidadRepository eR;
    @Override
    public void insert(Especialidad especialidad) {
        eR.save(especialidad);
    }

    @Override
    public List<Especialidad> list() {
        return eR.findAll();
    }
    @Override
    public void delete(int id){
        eR.deleteById(id);

    }

    @Override
    public Especialidad listId(int id) {
        return eR.findById(id).orElse(new Especialidad());
    }
    
}
