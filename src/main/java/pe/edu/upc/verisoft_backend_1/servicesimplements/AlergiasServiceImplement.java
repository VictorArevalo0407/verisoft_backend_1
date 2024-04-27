package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Alergias;
import pe.edu.upc.verisoft_backend_1.repositories.IAlergiasRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IAlergiasService;

import java.util.List;

@Service
public class AlergiasServiceImplement implements IAlergiasService {
@Autowired
    private IAlergiasRepository aR;
    @Override
    public void insert(Alergias alergias) {
        aR.save(alergias);

    }

    @Override
    public List<Alergias> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int id) {
        aR.deleteById(id);

    }

    @Override
    public Alergias listId(int id) {
        return aR.findById(id).orElse(new Alergias());
    }

    @Override
    public List<String[]> quantityAlergiasByPaciente() {
        return aR.quantityAlergiasByPaciente();
    }
}
