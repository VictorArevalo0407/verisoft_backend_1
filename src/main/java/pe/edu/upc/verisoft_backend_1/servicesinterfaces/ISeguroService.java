package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Seguro;

import java.util.List;

public interface ISeguroService {

    public void insert(Seguro seguro);

    public List<Seguro> list();

    public void delete(int id);
}
