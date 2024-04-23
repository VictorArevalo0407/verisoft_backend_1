package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IOncologoService;

import java.util.List;

@Service
public class OncologoServiceImplements implements IOncologoService {
    @Override
    public void insert(Oncologo oncologo) {

    }

    @Override
    public List<Oncologo> list() {
        return null;
    }

    @Override
    public void delete(int oncologo_id) {

    }

    @Override
    public Oncologo listId(int oncologo_id) {
        return null;
    }
}
