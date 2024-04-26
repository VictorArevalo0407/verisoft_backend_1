package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Comentario;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.repositories.IComentarioRepository;
import pe.edu.upc.verisoft_backend_1.repositories.IOncologoRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository comentarioRepository;
    @Autowired
    private IOncologoRepository oncologoRepository;

    @Override
    public void insert(Comentario comentario) {
        comentarioRepository.save(comentario);
    }

    @Override
    public List<Comentario> list() {
        return comentarioRepository.findAll();
    }

    @Override
    public Comentario findById(int id) {
        return comentarioRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Comentario> listByOncologo(int oncologoId) {
        Oncologo oncologo = oncologoRepository.findById(oncologoId).orElseThrow(() -> new RuntimeException("Oncologo no encontrado"));
        return comentarioRepository.findByOncologo(oncologo);
    }

    @Override
    public void delete(int id) {
        comentarioRepository.deleteById(id);
    }
}
