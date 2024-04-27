package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Cirugias;
import pe.edu.upc.verisoft_backend_1.repositories.ICirugiasRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ICirugiasService;

import java.util.List;

@Service
public class CirugiasServiceImplement implements ICirugiasService {
@Autowired
    private ICirugiasRepository cR;
    @Override
    public void insert(Cirugias cirugias) {
        cR.save(cirugias);

    }

    @Override
    public List<Cirugias> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public Cirugias listId(int id) {
        return cR.findById(id).orElse(new Cirugias());
    }

    @Override
    public List<String[]> quantityCirugiasByPaciente() {
        return cR.quantityCirugiasByPaciente();
    }
}
