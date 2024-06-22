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
@RequestMapping("/tratamientos")
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

    @PutMapping
    public void modificar(@RequestBody TratamientoDTO dto) {
        ModelMapper m = new ModelMapper();
        Tratamiento u = m.map(dto, Tratamiento.class);
        tS.insert(u);
    }

    @GetMapping
    public List<TratamientoDTO> listar() {
        return tS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, TratamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TratamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TratamientoDTO dto=m.map(tS.listId(id),TratamientoDTO.class);
        return dto;

    }
}
