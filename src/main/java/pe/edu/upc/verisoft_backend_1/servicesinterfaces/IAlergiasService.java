package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Alergias;

import java.util.List;

public interface IAlergiasService {
    public void insert(Alergias alergias);
    public List<Alergias> list();
    public void delete(int id);
    public Alergias listId(int id);
    public List<String[]> quantityAlergiasByPaciente();
}

