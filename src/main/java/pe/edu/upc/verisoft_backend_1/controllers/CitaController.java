package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.verisoft_backend_1.dtos.CitaDTO;
import pe.edu.upc.verisoft_backend_1.entities.Cita;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.ICitaService;

@RestController
@RequestMapping("/CITAS")

public class CitaController {
    @Autowired
    private ICitaService cS;
    @PostMapping
   public void insertarr(@RequestBody CitaDTO citaDTO){
        ModelMapper m = new ModelMapper();
        Cita c = m.map(citaDTO, Cita.class);
        cS.insert(c);

   }









}
