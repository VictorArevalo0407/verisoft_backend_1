package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.TipoTratamientoDTO;
import pe.edu.upc.verisoft_backend_1.entities.TipoTratamiento;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITipoTratamientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipostratamiento")
public class TipoTratamientoController {
    @Autowired
    private ITipoTratamientoService tS;
    @PostMapping
    public void insertar(@RequestBody TipoTratamientoDTO tipoTratamientoDTO){
        ModelMapper d = new ModelMapper();
        TipoTratamiento tipoTratamiento= d.map(tipoTratamientoDTO, TipoTratamiento.class);
        tS.insert(tipoTratamiento);
    }
    @GetMapping
    public List<TipoTratamientoDTO> listar(){
        return tS.list().stream().map(y->{
                    ModelMapper m= new ModelMapper();
                    return m.map(y,TipoTratamientoDTO.class);
                }
        ).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoTratamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TipoTratamientoDTO dto=m.map(tS.listId(id),TipoTratamientoDTO.class);
        return dto;

    }
}

