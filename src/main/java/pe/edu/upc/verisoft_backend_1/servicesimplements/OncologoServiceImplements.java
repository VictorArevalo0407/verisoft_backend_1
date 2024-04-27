package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.repositories.IOncologoRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IOncologoService;

import java.time.LocalDate;
import java.util.List;

@Service
public class OncologoServiceImplements implements IOncologoService {
    @Autowired
    private IOncologoRepository oR;
    @Override
    public void insert(Oncologo oncologo) {
        oR.save(oncologo);
    }

    @Override
    public List<Oncologo> list() {
        return oR.findAll();
    }
    @Override
    public void delete(int id){
        oR.deleteById(id);

    }
    @Override
    public Oncologo listId(int id) {
        return oR.findById(id).orElse(new Oncologo());
    }

    @Override
    public List<String[]> cantidaddecitasdeoncologosporfechas(LocalDate fechaingresada) {
        return oR.cantidaddecitasdeoncologosporfechas(fechaingresada);
    };

    @Override
    public List<String[]> promediodeestrellasporoncologo()
    {
        return oR.promediodeestrellasporoncologo();
    };
}
