package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int comentario_id;
    @ManyToOne
    @JoinColumn(name = "oncologo_id")
    private Oncologo oncologo_id;
    @ManyToOne
    @JoinColumn(name = "idPaciente")
    private Paciente idPaciente;
    @Column(name="Descripcion",nullable = false,length = 200)
    private String Descripcion;

    @Column(name = "estrellas", nullable = false)
    private int estrellas;

    public Comentario() {

    }

    public Comentario(int comentario_id, Oncologo oncologo_id, Paciente idPaciente, String descripcion, int estrellas) {
        this.comentario_id = comentario_id;
        this.oncologo_id = oncologo_id;
        this.idPaciente = idPaciente;
        Descripcion = descripcion;
        this.estrellas = estrellas;
    }

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
