package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Cita;
import pe.edu.upc.verisoft_backend_1.repositories.ICitaRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ICitaService;

import java.util.List;

@Service
public class CitaServiceImplement implements ICitaService {
    @Autowired
    private ICitaRepository cR;
    @Override
    public void insert(Cita cita) {
           cR.save(cita);
    }

    @Override
    public List<Cita> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<String[]> quantityCitasByOncologo() {
        return cR.quantityCitasByOncologo();
    }

    @Override
    public List<Cita> listCitaa(String nombreyapellido) {
        return cR.listCitaa(nombreyapellido);
    }
}
