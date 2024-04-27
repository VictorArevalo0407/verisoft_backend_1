package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.TratamientoDTO;
import pe.edu.upc.verisoft_backend_1.entities.Tratamiento;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITratamientoService;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public List<TratamientoDTO> listar() {
        return tS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, TratamientoDTO.class);
        }).collect(Collectors.toList());
    }

}
