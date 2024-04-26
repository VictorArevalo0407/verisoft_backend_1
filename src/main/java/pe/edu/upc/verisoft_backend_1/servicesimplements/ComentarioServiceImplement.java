package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Comentario;
import pe.edu.upc.verisoft_backend_1.repositories.IComentarioRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;
    @Override
    public void insert(Comentario comentario) {
        cR.save(comentario);
    }

    @Override
    public List<Comentario> list() {
        return cR.findAll();
    }
    @Override
    public void delete(int id){
        cR.deleteById(id);

    }

    @Override
    public Comentario listId(int id) {
        return cR.findById(id).orElse(new Comentario());
    }
}
