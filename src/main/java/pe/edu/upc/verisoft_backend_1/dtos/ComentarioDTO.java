package pe.edu.upc.verisoft_backend_1.dtos;

import jakarta.persistence.*;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;

public class ComentarioDTO {
    private int idComentario;
    private String descripcion;
    private int estrellas;
    private Paciente paciente;
    private Oncologo oncologo;

    public int getIdComentario() { return idComentario; }

    public void setIdComentario(int idComentario) { this.idComentario = idComentario; }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getEstrellas() { return estrellas; }

    public void setEstrellas(int estrellas) { this.estrellas = estrellas; }

    public Paciente getPaciente() { return paciente; }

    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Oncologo getOncologo() { return oncologo; }

    public void setOncologo(Oncologo oncologo) { this.oncologo = oncologo; }
}
