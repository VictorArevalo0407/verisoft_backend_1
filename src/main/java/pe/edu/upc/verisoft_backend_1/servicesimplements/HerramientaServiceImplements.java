package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import pe.edu.upc.verisoft_backend_1.entities.Herramienta;
import pe.edu.upc.verisoft_backend_1.repositories.IEspecialidadRepository;

import pe.edu.upc.verisoft_backend_1.repositories.IHerramientaRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IHerramientaService;

import java.util.List;
@Service
public class HerramientaServiceImplements implements IHerramientaService {
    @Autowired
    private IHerramientaRepository eR;
    @Override
    public void insert(Herramienta herramienta) {
        eR.save(herramienta);
    }

    @Override
    public List<Herramienta> list() {
        return eR.findAll();
    }
    @Override
    public void delete(int id){
        eR.deleteById(id);

    }

    @Override
    public Herramienta listId(int id) {
        return eR.findById(id).orElse(new Herramienta());
    }

}
