package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Seguro;
import pe.edu.upc.verisoft_backend_1.repositories.ISeguroRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ISeguroService;

import java.util.List;

@Service
public class SeguroServiceimplement implements ISeguroService {
@Autowired
    private ISeguroRepository mR;


    @Override
    public void insert(Seguro seguro) {
mR.save(seguro);
    }

    @Override
    public List<Seguro> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }
}
