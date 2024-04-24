package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Tratamiento;
import pe.edu.upc.verisoft_backend_1.repositories.ITratamientoRepositorry;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITratamientoService;

import java.util.List;

@Service
public class TratamientoServiceImplement implements ITratamientoService {
    @Autowired
    private ITratamientoRepositorry oR;
    @Override
    public void insert(Tratamiento tratamiento) {
oR.save(tratamiento);
    }

    @Override
    public List<Tratamiento> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int id) {
oR.deleteById(id);

    }
}
