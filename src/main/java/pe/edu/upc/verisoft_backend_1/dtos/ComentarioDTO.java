package pe.edu.upc.verisoft_backend_1.dtos;

import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;

public class ComentarioDTO {
    private int comentario_id;
    private Oncologo oncologo_id;
    private Paciente idPaciente;
    private String Descripcion;
    private int estrellas;

    public int getComentario_id() {
        return comentario_id;
    }

    public void setComentario_id(int comentario_id) {
        this.comentario_id = comentario_id;
    }

    public Oncologo getOncologo_id() {
        return oncologo_id;
    }

    public void setOncologo_id(Oncologo oncologo_id) {
        this.oncologo_id = oncologo_id;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
}
