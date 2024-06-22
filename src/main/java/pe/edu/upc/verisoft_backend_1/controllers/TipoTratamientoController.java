package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.EspecialidadDTO;
import pe.edu.upc.verisoft_backend_1.dtos.TipoTratamientoDTO;
import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import pe.edu.upc.verisoft_backend_1.entities.TipoTratamiento;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ITipoTratamientoService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/tipotratamientos")
public class TipoTratamientoController {
    //a
    @Autowired
    private ITipoTratamientoService ttS;
    @PostMapping
    public void insertar(@RequestBody TipoTratamientoDTO TipoTratamientoDTO) {
        ModelMapper m = new ModelMapper();
        TipoTratamiento t = m.map(TipoTratamientoDTO, TipoTratamiento.class);
        ttS.insert(t);
    }
    @GetMapping
    public List<TipoTratamientoDTO> listar() {
        return ttS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, TipoTratamientoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        ttS.delete(id);
    }
    @GetMapping("/{id}")
    public TipoTratamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TipoTratamientoDTO dto=m.map(ttS.listId(id),TipoTratamientoDTO.class);
        return dto;

    }
    @PutMapping
    public void modificar(@RequestBody TipoTratamientoDTO dto){
        ModelMapper m=new ModelMapper();
        TipoTratamiento d=m.map(dto,TipoTratamiento.class);
        ttS.insert(d);
    }
}
