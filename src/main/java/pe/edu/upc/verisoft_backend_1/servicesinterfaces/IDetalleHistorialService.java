package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.DetalleHistorial;
import pe.edu.upc.verisoft_backend_1.entities.ExamenDeteccion;

import java.util.List;

public interface IDetalleHistorialService {
    public void insert(DetalleHistorial detalleHistorial);
    public List<DetalleHistorial> list();

}
