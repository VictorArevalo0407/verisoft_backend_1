package pe.edu.upc.verisoft_backend_1.servicesinterfaces;
import pe.edu.upc.verisoft_backend_1.entities.Cirugias;

import java.util.List;

public interface ICirugiasService {
    public void insert(Cirugias cirugias);
    public List<Cirugias> list();
    public void delete(int id);
    public Cirugias listId(int id);
    public List<String[]> quantityCirugiasByPaciente();

}
