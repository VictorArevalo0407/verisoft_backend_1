package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.ExamenDeteccion;

import java.util.List;

public interface IExamenDeteccionService {
    public void insert(ExamenDeteccion examenDeteccion);
    public List<ExamenDeteccion> list();
}
