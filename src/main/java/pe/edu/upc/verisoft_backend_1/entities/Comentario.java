package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;

    @Column(name = "Descripcion", nullable = false)
    private String descripcion;

    @Column(name = "Estrellas", nullable = false)
    private int estrellas;

    @ManyToOne
    @JoinColumn(name = "PacienteId")
    private Paciente paciente;

    @ManyToOne()
    @JoinColumn(name ="OncologoId")
    private Oncologo oncologo;

    public Comentario() {
    }

    public Comentario(int idComentario, String descripcion, int estrellas, Paciente paciente, Oncologo oncologo) {
        this.idComentario = idComentario;
        this.descripcion = descripcion;
        this.estrellas = estrellas;
        this.paciente = paciente;
        this.oncologo = oncologo;
    }

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
