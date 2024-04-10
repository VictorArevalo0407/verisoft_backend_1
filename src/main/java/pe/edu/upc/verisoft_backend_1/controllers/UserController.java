package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.RoleDTO;
import pe.edu.upc.verisoft_backend_1.dtos.UserDTO;
import pe.edu.upc.verisoft_backend_1.entities.Users;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IUserService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;

    @GetMapping
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);

        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id),UserDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @PostMapping("/insertar-rol")
    public void insertarRol(@RequestBody RoleDTO dto) {
        uS.insRol(dto.getRol(), dto.getUser().getId());
    }

    
}

