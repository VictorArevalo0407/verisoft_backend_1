package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.verisoft_backend_1.dtos.TratamientoDTO;
import pe.edu.upc.verisoft_backend_1.entities.Tratamiento;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITratamientoService;

@RestController
@RequestMapping("/Tratamientos")
public class TratamientoController
{
    @Autowired
    private ITratamientoService tS;
    @PostMapping
    public void insertar(@RequestBody TratamientoDTO tratamientoDTO) {
        ModelMapper m = new ModelMapper();
        Tratamiento t = m.map(tratamientoDTO, Tratamiento.class);
        tS.insert(t);
    }

}
