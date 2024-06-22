package pe.edu.upc.verisoft_backend_1.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.CitaByOncologoDTO;
import pe.edu.upc.verisoft_backend_1.dtos.CitaDTO;
import pe.edu.upc.verisoft_backend_1.entities.Cita;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ICitaService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")

public class CitaController {
    @Autowired
    private ICitaService cS;

    @PostMapping
   public void insertarr(@RequestBody CitaDTO citaDTO) {
        ModelMapper m = new ModelMapper();
        Cita c = m.map(citaDTO, Cita.class);
        cS.insert(c);

    }
@GetMapping("/CantidadCitas")
        public List<CitaByOncologoDTO> cantidaddepacientesporoncologo() {
    List<String[]> filaListaa = cS.quantityCitasByOncologo();
    List<CitaByOncologoDTO> dtoList = new ArrayList<>();
    for (String[] columna : filaListaa) {
        CitaByOncologoDTO dto = new CitaByOncologoDTO();
        dto.setNameOnco(columna[0]);
        dto.setQuantityCita(Integer.parseInt(columna[1]));
        dtoList.add(dto);

    }
return dtoList;

}
    @GetMapping
    public List<CitaDTO> listar() {
        return cS.list().stream().map(cita -> {
            ModelMapper mapper = new ModelMapper();
            return mapper.map(cita, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/ConsultaNombre")
    public List<CitaDTO> listaCitaa(@RequestParam String oncologo){
        return cS.listCitaa(oncologo).stream().map(p->{
            ModelMapper c= new ModelMapper();
            return c.map(p,CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    //@PreAuthorize("hasAuthority('Oncologo')")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);

    }

    @PutMapping()
    public void modificar(@RequestBody CitaDTO dto){
        ModelMapper m=new ModelMapper();
        Cita mo=m.map(dto,Cita.class);
        cS.insert(mo);
    }

    @GetMapping("/{id}")
    public CitaDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m=new ModelMapper();
        CitaDTO dto=m.map(cS.listarId(id),CitaDTO.class);
        return dto;
    }

}
