package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import java.util.List;

public interface IEspecialidadService {
    public void insert(Especialidad especialidad);
    public List<Especialidad> list();
    public void delete(int id);
    public Especialidad listId(int id) ;
}
