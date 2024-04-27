package pe.edu.upc.verisoft_backend_1.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.verisoft_backend_1.dtos.PacienteEstadoGradoRespuestaDTO;
import pe.edu.upc.verisoft_backend_1.dtos.PacienteGradoRespuestaDTO;
import pe.edu.upc.verisoft_backend_1.dtos.RespuestaDTO;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IRespuestaService;

import java.util.ArrayList;
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

            @GetMapping("/respuestasPG")
            public List<PacienteGradoRespuestaDTO> RespuestasPorPacienteYGrado() {
                List<String[]> filaLista = rS.quantityRespuestasByPacienteAndGrado();
                List<PacienteGradoRespuestaDTO> dtoLista = new ArrayList<>();
                for (String[] columna : filaLista) {
                    PacienteGradoRespuestaDTO dto = new PacienteGradoRespuestaDTO();
                    dto.setIdPaciente(Integer.parseInt(columna[0]));
                    dto.setGradoConsulta(columna[1]);
                    dto.setCantidadTotalRespuestas(Integer.parseInt(columna[2]));
                    dtoLista.add(dto);
                }
                return dtoLista;

            }

            @GetMapping("/respuestasPEG")
            public List<PacienteEstadoGradoRespuestaDTO> RespuestasPorPacienteEstadoYGrado() {
                List<String[]> filaLista = rS.quantityRespuestasByPacienteEstadoAndGrado();
                List<PacienteEstadoGradoRespuestaDTO> dtoLista = new ArrayList<>();
                for (String[] columna : filaLista) {
                    PacienteEstadoGradoRespuestaDTO dto = new PacienteEstadoGradoRespuestaDTO();
                    dto.setIdPaciente(Integer.parseInt(columna[0]));
                    dto.setGradoConsulta(columna[1]);
                    dto.setEstadoConsulta(columna[2]);
                    dto.setCantidadTotalRespuestas(Integer.parseInt(columna[3]));
                    dtoLista.add(dto);
                }
                return dtoLista;
            }
        }



