package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "DetalleHistorial")

public class DetalleHistorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleHistorial;
    @Column(name = "fechaDetalleHistorial",nullable=false)
    private LocalDate fechaDetalleHistorial;
    @ManyToOne
    @JoinColumn(name = "seguroid")
    private  Seguro seguro;
    @ManyToOne
    @JoinColumn(name = "cirugiasid")
    private  Cirugias cirugias;
    @ManyToOne
    @JoinColumn(name = "tratamiento")
    private  Tratamiento tratamiento;
    @ManyToOne
    @JoinColumn(name = "examenDeteccionid")
    private ExamenDeteccion examenDeteccion;
    @ManyToOne
    @JoinColumn(name = "historialClinicoid")
    private HistorialClinico historialClinico;

    public DetalleHistorial() {
    }

    public DetalleHistorial(int idDetalleHistorial, LocalDate fechaDetalleHistorial, Seguro seguro, Cirugias cirugias, Tratamiento tratamiento, ExamenDeteccion examenDeteccion, HistorialClinico historialClinico) {
        this.idDetalleHistorial = idDetalleHistorial;
        this.fechaDetalleHistorial = fechaDetalleHistorial;
        this.seguro = seguro;
        this.cirugias = cirugias;
        this.tratamiento = tratamiento;
        this.examenDeteccion = examenDeteccion;
        this.historialClinico = historialClinico;
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

    public HistorialClinico getHistorialClinico() {
        return historialClinico;
    }

    public void setHistorialClinico(HistorialClinico historialClinico) {
        this.historialClinico = historialClinico;
    }
}
