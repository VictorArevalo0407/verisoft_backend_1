package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.DetalleHistorialDTO;
import pe.edu.upc.verisoft_backend_1.dtos.ExamenDeteccionDTO;
import pe.edu.upc.verisoft_backend_1.entities.DetalleHistorial;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IDetalleHistorialService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/DetalleHistorial")
public class DetalleHistorialControlller {
    @Autowired
    private IDetalleHistorialService dS;

    @GetMapping
    public List<DetalleHistorialDTO> listar() {
        return dS.list().stream().map(y-> {
            ModelMapper m=new ModelMapper();
            return m.map(y,DetalleHistorialDTO.class);
        }).collect(Collectors.toList());
    }
@PostMapping
    public void insertar(@RequestBody DetalleHistorialDTO detalleHistorialDTO) {
    ModelMapper m = new ModelMapper();
    DetalleHistorial d= m.map(detalleHistorialDTO, DetalleHistorial.class);
    dS.insert(d);
    }

}
