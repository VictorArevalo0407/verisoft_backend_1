package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.PacienteDTO;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IPacienteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pS;

    @PostMapping
    public void insertar(PacienteDTO pacienteDTO) {
        ModelMapper m = new ModelMapper();
        Paciente p = m.map(pacienteDTO, Paciente.class);
        pS.insert(p);
    }
    @PutMapping
    public void modificar(@RequestBody PacienteDTO pacienteDTO) {
        ModelMapper m = new ModelMapper();
        Paciente paciente = m.map(pacienteDTO, Paciente.class);
        pS.insert(paciente);
    }
    @GetMapping
    public List<PacienteDTO> listar() {
        return pS.list().stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, PacienteDTO.class);
        }).collect(Collectors.toList());
    }
}
