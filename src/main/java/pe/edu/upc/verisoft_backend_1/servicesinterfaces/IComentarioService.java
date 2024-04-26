package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Comentario;

import java.util.List;

public interface IComentarioService {
    public void insert(Comentario comentario);

    public List<Comentario> list();
    public Comentario findById(int id);

    public List<Comentario> listByOncologo(int oncologoId);

    public void delete(int id);
}

