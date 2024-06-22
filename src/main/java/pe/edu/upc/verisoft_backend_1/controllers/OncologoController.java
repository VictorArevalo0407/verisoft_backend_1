package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.OncologoDTO;
import pe.edu.upc.verisoft_backend_1.dtos.QueryCitasOncologoPorFechaDTO;
import pe.edu.upc.verisoft_backend_1.dtos.QueryPromedioEstrellasOncologoDTO;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IOncologoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/oncologos")
public class OncologoController {
    @Autowired
    private IOncologoService oS;

    @PostMapping
    //@PreAuthorize("hasAuthority('ONCOLOGO')")
    public void registrar(@RequestBody OncologoDTO dto){
        ModelMapper m = new ModelMapper();
        Oncologo o = m.map(dto, Oncologo.class);
        oS.insert(o);
    }

    @GetMapping
    //@PreAuthorize("hasAuthority('ONCOLOGO') OR hasAuthority('USER')")
    public List<OncologoDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, OncologoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OncologoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        OncologoDTO dto = m.map(oS.listId(id),OncologoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody OncologoDTO dto){
        ModelMapper m = new ModelMapper();
        Oncologo o = m.map(dto, Oncologo.class);
        oS.insert(o);
    }

    @GetMapping("/citasporfecha/{fechaingresada}")
    public List<QueryCitasOncologoPorFechaDTO> CitasPorFechaDTO(@PathVariable("fechaingresada") String fechaingresada) {
        List<String[]> Lista1 = oS.cantidaddecitasdeoncologosporfechas(LocalDate.parse(fechaingresada));
        List<QueryCitasOncologoPorFechaDTO> Lista2=new ArrayList<>();
        for(String[] Columna:Lista1){
            QueryCitasOncologoPorFechaDTO QueryDTO=new QueryCitasOncologoPorFechaDTO();
            QueryDTO.setNombreyapellido(Columna[0]);
            QueryDTO.setCantidadcitas(Integer.parseInt(Columna[1]));
            QueryDTO.setFecha(LocalDate.parse(Columna[2]));
            Lista2.add(QueryDTO);
        }
        return Lista2;
    }

    @GetMapping("/promedioestrellas")
    public List<QueryPromedioEstrellasOncologoDTO> PromedioEstrellasDeOncologos() {
        List<String[]> Lista1 = oS.promediodeestrellasporoncologo();
        List<QueryPromedioEstrellasOncologoDTO> Lista2=new ArrayList<>();
        for(String[] Columna:Lista1){
            QueryPromedioEstrellasOncologoDTO QueryDTO=new QueryPromedioEstrellasOncologoDTO();
            QueryDTO.setNombreyapellido(Columna[0]);
            QueryDTO.setPromedioestrellas(Float.parseFloat(Columna[1]));
            Lista2.add(QueryDTO);
        }
        return Lista2;
    }


}