package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    private IComentarioService comentarioService;

    @PostMapping
    public void insertar(ComentarioDTO comentarioDTO) {
        ModelMapper mapper = new ModelMapper();
        Comentario newComentario = mapper.map(comentarioDTO, Comentario.class);
        comentarioService.insert(newComentario);
    }

    @GetMapping
    public List<ComentarioDTO> listar() {
        return comentarioService.list().stream().map(comentario -> {
            ModelMapper mapper = new ModelMapper();
            return mapper.map(comentario, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ComentarioDTO buscarporID(@PathVariable("id")int id) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(comentarioService.findById(id), ComentarioDTO.class);
    }

    @GetMapping("/oncologo/{oncologoId}")
    public List<ComentarioDTO> listarPorOncologo(@PathVariable("oncologoId") Integer oncologoId) {
        return comentarioService.listByOncologo(oncologoId).stream().map(comentario -> {
            ModelMapper mapper = new ModelMapper();
            return mapper.map(comentario, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    public void modificar(@RequestBody ComentarioDTO comentarioDTO) {
        ModelMapper mapper = new ModelMapper();
        Comentario comentario = mapper.map(comentarioDTO, Comentario.class);
        comentarioService.insert(comentario);
    }

    @DeleteMapping("/{comentarioId}")
    public void eliminar(@PathVariable("comentarioId") Integer id) {
        comentarioService.delete(id);
    }
}
