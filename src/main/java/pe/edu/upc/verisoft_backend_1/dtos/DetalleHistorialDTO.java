package pe.edu.upc.verisoft_backend_1.dtos;


import pe.edu.upc.verisoft_backend_1.entities.*;

import java.time.LocalDate;

public class DetalleHistorialDTO {
    private int idDetalleHistorial;

    private LocalDate fechaDetalleHistorial;

    private Seguro seguro;

    private Cirugias cirugias;

    private Tratamiento tratamiento;

    private ExamenDeteccion examenDeteccion;

    private Paciente paciente;

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
