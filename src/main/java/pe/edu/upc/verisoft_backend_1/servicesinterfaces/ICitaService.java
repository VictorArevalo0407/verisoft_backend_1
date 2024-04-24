package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Cita;

import java.util.List;

public interface ICitaService {
    public void insert(Cita cita);

    public List<Cita> list();

    public void delete(int id);
}
