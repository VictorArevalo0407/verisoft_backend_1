package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Oncologo;

import java.time.LocalDate;
import java.util.List;

public interface IOncologoService {

    public void insert(Oncologo oncologo);
    public List<Oncologo> list();
    public void delete(int oncologo_id);
    public Oncologo listId(int oncologo_id);
    public List<String[]> cantidaddecitasdeoncologosporfechas(LocalDate fechaingresada);
    public List<String[]> promediodeestrellasporoncologo();
}
