package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Herramienta;

import java.util.List;

public interface IHerramientaService {
    public void insert(Herramienta herramienta);
    public List<Herramienta> list();
    public void delete(int id);
    public Herramienta listId(int id) ;
}
