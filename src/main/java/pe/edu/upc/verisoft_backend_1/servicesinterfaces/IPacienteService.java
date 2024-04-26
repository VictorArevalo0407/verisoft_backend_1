package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Paciente;

import java.util.List;

public interface IPacienteService {
    public void insert(Paciente paciente);
    public List<Paciente> list();
}
