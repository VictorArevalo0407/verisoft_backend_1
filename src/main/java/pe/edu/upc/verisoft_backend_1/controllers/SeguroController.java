package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.SeguroDTO;
import pe.edu.upc.verisoft_backend_1.entities.Seguro;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ISeguroService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/seguros")
public class SeguroController {
    @Autowired
    private ISeguroService mS;

    @PostMapping()
    public void insertar(@RequestBody SeguroDTO seguroDTO){

        ModelMapper d = new ModelMapper();
        Seguro seguro = d.map(seguroDTO, Seguro.class);
        mS.insert(seguro);
    }
    @GetMapping
    public List<SeguroDTO> listar(){
        return mS.list().stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,SeguroDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public SeguroDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        SeguroDTO dto=m.map(mS.listarId(id),SeguroDTO.class);
        return dto;
    }
    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('Oncologo')")
    public void eliminar(@PathVariable("id") Integer id){
        mS.delete(id);

    }
    @PutMapping()
    public void modificar(@RequestBody SeguroDTO dto){
        ModelMapper m=new ModelMapper();
        Seguro mo=m.map(dto,Seguro.class);
        mS.insert(mo);
    }



}


