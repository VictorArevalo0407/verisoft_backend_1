package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.verisoft_backend_1.dtos.DetalleHistorialDTO;
import pe.edu.upc.verisoft_backend_1.entities.DetalleHistorial;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IDetalleHistorialService;
@RestController
@RequestMapping("/DetalleHistorial")
public class DetalleHistorialControlller {
    @Autowired
    private IDetalleHistorialService dS;
@PostMapping
    public void insertar(@RequestBody DetalleHistorialDTO detalleHistorialDTO) {
    ModelMapper m = new ModelMapper();
    DetalleHistorial d= m.map(detalleHistorialDTO, DetalleHistorial.class);
    dS.insert(d);
    }

}
