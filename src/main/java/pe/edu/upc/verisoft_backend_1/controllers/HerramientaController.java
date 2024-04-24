package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.HerramientaDTO;
import pe.edu.upc.verisoft_backend_1.entities.Herramienta;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IHerramientaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/herramientas")
public class HerramientaController {
    @Autowired
    private IHerramientaService hS;
    @PostMapping
    public void insertar(@RequestBody HerramientaDTO herramientaDTO){
        ModelMapper d = new ModelMapper();
        Herramienta herramienta= d.map(herramientaDTO, Herramienta.class);
        hS.insert(herramienta);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')OR hasAuthority('ONCOLOGO')")
    public List<HerramientaDTO> listar(){
        return hS.list().stream().map(y->{
                    ModelMapper m= new ModelMapper();
                    return m.map(y,HerramientaDTO.class);
                }
        ).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }
    @GetMapping("/{id}")
    public HerramientaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        HerramientaDTO dto=m.map(hS.listId(id),HerramientaDTO.class);
        return dto;

    }
}
