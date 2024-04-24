package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.PacienteDTO;
import pe.edu.upc.verisoft_backend_1.dtos.RespuestasByStatusDTO;
import pe.edu.upc.verisoft_backend_1.dtos.UsersByGradoDTO;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IPacienteService;

import java.util.ArrayList;
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
    @GetMapping("/{id}")
    public PacienteDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PacienteDTO dto=m.map(pS.listId(id),PacienteDTO.class);
        return dto;
    }
    @GetMapping("/cantidades")
    public List<RespuestasByStatusDTO> cantidadRespuestasporEstadoActivo() {
        List<String[]> filaLista = pS.quantityRespuestasByStatus();
        List<RespuestasByStatusDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            RespuestasByStatusDTO dto = new RespuestasByStatusDTO();
            dto.setEstadoPaciente(columna[0]);
            dto.setQuantityRespuestasByStatus(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
    @GetMapping("/total")
    public List<UsersByGradoDTO> totalUsuarios() {
        List<String[]> filaLista = pS.totalUsuariosporGrado();
        List<UsersByGradoDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            UsersByGradoDTO dto = new UsersByGradoDTO();
            dto.setGradoPaciente(columna[0]);
            dto.setTotalUsuarios(Integer.parseInt(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

}
