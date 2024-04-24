package pe.edu.upc.verisoft_backend_1.servicesinterfaces;


import pe.edu.upc.verisoft_backend_1.entities.Tratamiento;

import java.util.List;

public interface ITratamientoService {

    public void insert(Tratamiento tratamiento);

    public List<Tratamiento> list();

    public void delete(int id);
}
