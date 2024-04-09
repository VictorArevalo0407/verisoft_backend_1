package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.TipoTratamiento;

import java.util.List;

public interface ITipoTratamientoService {
    public void insert(TipoTratamiento tipoTratamiento);
    public List<TipoTratamiento> list();
    public void delete(int id);
    public TipoTratamiento listId(int id) ;
}
