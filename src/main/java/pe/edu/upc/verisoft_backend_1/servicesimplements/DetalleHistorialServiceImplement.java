package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.DetalleHistorial;
import pe.edu.upc.verisoft_backend_1.entities.ExamenDeteccion;
import pe.edu.upc.verisoft_backend_1.repositories.IDetalleHistorialRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IDetalleHistorialService;

import java.util.List;

@Service
public class DetalleHistorialServiceImplement implements IDetalleHistorialService {
    @Autowired
    private IDetalleHistorialRepository dR;
    @Override
    public void insert(DetalleHistorial detalleHistorial) { dR.save(detalleHistorial);}

    @Override
    public List<DetalleHistorial> list() { return dR.findAll();
        }
}
