package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.ComentarioDTO;
import pe.edu.upc.verisoft_backend_1.entities.Comentario;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IComentarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;
    @PostMapping
    public void insertar(@RequestBody ComentarioDTO comentarioDTO){
        ModelMapper d = new ModelMapper();
        Comentario comentario= d.map(comentarioDTO, Comentario.class);
        cS.insert(comentario);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')OR hasAuthority('ONCOLOGO')")
    public List<ComentarioDTO> listar(){
        return cS.list().stream().map(y->{
                    ModelMapper m= new ModelMapper();
                    return m.map(y,ComentarioDTO.class);
                }
        ).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO dto=m.map(cS.listId(id),ComentarioDTO.class);
        return dto;
    }
}
