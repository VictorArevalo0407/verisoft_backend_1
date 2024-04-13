package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.RoleDTO;
import pe.edu.upc.verisoft_backend_1.entities.Role;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IRoleService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;

    @GetMapping
    public List<RoleDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    public RoleDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.listId(id),RoleDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rS.insert(r);
    }
}
