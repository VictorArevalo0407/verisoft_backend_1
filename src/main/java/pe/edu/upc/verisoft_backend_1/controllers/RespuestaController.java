package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.RespuestaDTO;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IRespuestaService;

import java.util.List;
import java.util.stream.Collectors;

        @RestController
        @RequestMapping("/respuestas")
        public class RespuestaController {
            @Autowired
            private IRespuestaService rS;

            @PostMapping
            public void insertar(@RequestBody RespuestaDTO respuestaDTO) {
                ModelMapper d = new ModelMapper();
                Respuesta respuesta = d.map(respuestaDTO, Respuesta.class);
                rS.insert(respuesta);
            }

            @PutMapping
            public void modificar(@RequestBody RespuestaDTO respuestaDTO) {
                ModelMapper d = new ModelMapper();
                Respuesta respuesta = d.map(respuestaDTO, Respuesta.class);
                rS.insert(respuesta);
            }

            @GetMapping
            public List<RespuestaDTO> listar() {
                return rS.list().stream().map(y -> {
                    ModelMapper m = new ModelMapper();
                    return m.map(y, RespuestaDTO.class);
                }).collect(Collectors.toList());
            }
        }



