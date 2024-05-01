package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.CirugiasByPacienteDTO;
import pe.edu.upc.verisoft_backend_1.dtos.CirugiasDTO;
import pe.edu.upc.verisoft_backend_1.entities.Cirugias;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ICirugiasService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cirugias")
public class CirugiasController {
    @Autowired
    private ICirugiasService cS;

    @PostMapping

    public void insertar(@RequestBody CirugiasDTO cirugiasDTO) {
        ModelMapper d = new ModelMapper();
        Cirugias cirugias = d.map(cirugiasDTO, Cirugias.class);
        cS.insert(cirugias);
    }
    @GetMapping
    public List<Cirugias> listar(){
    return cS.list().stream().map(p->{
        ModelMapper c= new ModelMapper();
        return c.map(p,Cirugias.class);
    }).collect(Collectors.toList());
        }
@DeleteMapping("/{id}")
        public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);

        }
        @GetMapping("/id")
        public CirugiasDTO listarId(Integer id){
        ModelMapper c= new ModelMapper();
        CirugiasDTO dto= c.map(cS.listId(id), CirugiasDTO.class);
        return dto;
        }
        @GetMapping("/cantidadescirugias")
        public List<CirugiasByPacienteDTO> cantidadCirugiasPaciente(){
            List<String[]>filaLista=cS.quantityCirugiasByPaciente();
            List<CirugiasByPacienteDTO> dtoLista=new ArrayList<>();
            for(String[] columna:filaLista){
                CirugiasByPacienteDTO dto=new CirugiasByPacienteDTO();
                dto.setId_paciente(Integer.parseInt(columna[0]));
                dto.setQuantityCirugias(Integer.parseInt(columna[1]));
                dtoLista.add(dto);

            }
            return dtoLista;
        }


}
