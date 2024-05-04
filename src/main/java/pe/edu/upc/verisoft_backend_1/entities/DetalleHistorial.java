package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "DetalleHistorial")
public class DetalleHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_historial")
    private int idDetalleHistorial;

    @Column(name = "fecha_detalle_historial", nullable = false)
    private LocalDate fechaDetalleHistorial;

    @ManyToOne
    @JoinColumn(name = "seguro_id")
    private Seguro seguro;

    @ManyToOne
    @JoinColumn(name = "cirugias_id")
    private Cirugias cirugias;

    @ManyToOne
    @JoinColumn(name = "tratamiento_id")
    private Tratamiento tratamiento;

    @ManyToOne
    @JoinColumn(name = "examen_deteccion_id")
    private ExamenDeteccion examenDeteccion;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public DetalleHistorial() {
    }

    public DetalleHistorial(int idDetalleHistorial, LocalDate fechaDetalleHistorial, Seguro seguro, Cirugias cirugias, Tratamiento tratamiento, ExamenDeteccion examenDeteccion, Paciente paciente) {
        this.idDetalleHistorial = idDetalleHistorial;
        this.fechaDetalleHistorial = fechaDetalleHistorial;
        this.seguro = seguro;
        this.cirugias = cirugias;
        this.tratamiento = tratamiento;
        this.examenDeteccion = examenDeteccion;
        this.paciente = paciente;
    }

    public int getIdDetalleHistorial() {
        return idDetalleHistorial;
    }

    public void setIdDetalleHistorial(int idDetalleHistorial) {
        this.idDetalleHistorial = idDetalleHistorial;
    }

    public LocalDate getFechaDetalleHistorial() {
        return fechaDetalleHistorial;
    }

    public void setFechaDetalleHistorial(LocalDate fechaDetalleHistorial) {
        this.fechaDetalleHistorial = fechaDetalleHistorial;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }

    public Cirugias getCirugias() {
        return cirugias;
    }

    public void setCirugias(Cirugias cirugias) {
        this.cirugias = cirugias;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    public ExamenDeteccion getExamenDeteccion() {
        return examenDeteccion;
    }

    public void setExamenDeteccion(ExamenDeteccion examenDeteccion) {
        this.examenDeteccion = examenDeteccion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
