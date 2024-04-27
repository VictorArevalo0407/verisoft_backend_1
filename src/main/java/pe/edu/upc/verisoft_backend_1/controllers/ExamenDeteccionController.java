package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.ExamenDeteccionDTO;
import pe.edu.upc.verisoft_backend_1.dtos.PacienteDTO;
import pe.edu.upc.verisoft_backend_1.entities.ExamenDeteccion;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IExamenDeteccionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/examenes")
public class ExamenDeteccionController {
    @Autowired
    private IExamenDeteccionService eS;
    @PostMapping
    public void isertar(@RequestBody ExamenDeteccionDTO examenDeteccionDTO){
        ModelMapper d=new ModelMapper();
        ExamenDeteccion examenDeteccion=d.map(examenDeteccionDTO, ExamenDeteccion.class);
        eS.insert(examenDeteccion);
    }
    @PutMapping
    public void modificar(@RequestBody ExamenDeteccionDTO examenDeteccionDTO) {
        ModelMapper m = new ModelMapper();
        ExamenDeteccion examenDeteccion = m.map(examenDeteccionDTO, ExamenDeteccion.class);
        eS.insert(examenDeteccion);
    }
    @GetMapping
    public List<ExamenDeteccionDTO> listar() {
    return eS.list().stream().map(y-> {
        ModelMapper m=new ModelMapper();
        return m.map(y,ExamenDeteccionDTO.class);
    }).collect(Collectors.toList());
    }
}
