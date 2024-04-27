package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.AlergiasDTO;
import pe.edu.upc.verisoft_backend_1.entities.Alergias;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IAlergiasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("alergias")
public class AlergiasController {
    @Autowired
    private IAlergiasService aS;

    @PostMapping

    public void insertar(@RequestBody AlergiasDTO alergiasDTO) {
        ModelMapper b = new ModelMapper();
        Alergias alergias = b.map(alergiasDTO, Alergias.class);
        aS.insert(alergias);
    }
    @GetMapping
    public List<Alergias> listar(){
    return aS.list().stream().map(b->{
        ModelMapper a= new ModelMapper();
        return a.map(b,Alergias.class);
    }).collect(Collectors.toList());
    }
@DeleteMapping("/id")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.delete(id);

    }
@GetMapping("/id")
    public AlergiasDTO listarId(Integer id){
    ModelMapper a= new ModelMapper();
    AlergiasDTO dto= a.map(aS.listId(id), AlergiasDTO.class);
        return dto;
    }

}
