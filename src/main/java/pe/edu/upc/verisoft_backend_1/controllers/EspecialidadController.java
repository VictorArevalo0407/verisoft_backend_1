package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.EspecialidadDTO;
import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IEspecialidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/especialidades")
public class EspecialidadController {
    @Autowired
    private IEspecialidadService eS;
    @PostMapping
    public void insertar(@RequestBody EspecialidadDTO especialidadDTO){
        ModelMapper d = new ModelMapper();
        Especialidad especialidad= d.map(especialidadDTO, Especialidad.class);
        eS.insert(especialidad);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')OR hasAuthority('ONCOLOGO')")
    public List<EspecialidadDTO> listar(){
        return eS.list().stream().map(y->{
                    ModelMapper m= new ModelMapper();
                    return m.map(y,EspecialidadDTO.class);
                }
        ).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EspecialidadDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        EspecialidadDTO dto=m.map(eS.listId(id),EspecialidadDTO.class);
        return dto;

    }

    @PutMapping
    public void modificar(@RequestBody EspecialidadDTO dto){
        ModelMapper m=new ModelMapper();
        Especialidad d=m.map(dto,Especialidad.class);
        eS.insert(d);
    }

}
