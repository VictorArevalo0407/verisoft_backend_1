package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.ExamenDeteccion;
import pe.edu.upc.verisoft_backend_1.repositories.IExamenDeteccionRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IExamenDeteccionService;

import java.util.List;

@Service
public class ExamenDeteccionServieImplement implements IExamenDeteccionService {

    @Autowired
    private IExamenDeteccionRepository eR;
    @Override
    public void insert(ExamenDeteccion examenDeteccion) {
    eR.save(examenDeteccion);
    }

    @Override
    public List<ExamenDeteccion> list() {
        return eR.findAll();
    }
}
