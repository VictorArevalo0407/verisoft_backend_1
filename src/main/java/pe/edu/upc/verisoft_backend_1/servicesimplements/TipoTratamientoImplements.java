package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.TipoTratamiento;
import pe.edu.upc.verisoft_backend_1.repositories.ITipoTratamientoRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITipoTratamientoService;

import java.util.List;

@Service
public class TipoTratamientoImplements implements ITipoTratamientoService {
    @Autowired
    private ITipoTratamientoRepository tR;
    @Override
    public void insert(TipoTratamiento tipoTratamiento) {
        tR.save(tipoTratamiento);
    }

    @Override
    public List<TipoTratamiento> list() {
        return tR.findAll();
    }
    @Override
    public void delete(int id){
        tR.deleteById(id);

    }

    @Override
    public TipoTratamiento listId(int id) {
        return tR.findById(id).orElse(new TipoTratamiento());
    }
}
