package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name ="Tratamiento")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTratamiento;
    @Column(name = "DescripcionTratamiento",nullable = false, length = 200)
    private String DescripcionTratamiento;
    @Column(name = "EstadoTratamiento",nullable = false, length = 20)
    private String EstadoTratamiento;
    @Column(name = "PresupuestoTratamiento",nullable = false)
    private int PresupuestoTratamiento;
    @Column(name = "FechaTratamiento",nullable = false)
    private LocalDate FechaTratamiento;
    @Column(name = "FechaFinTratamiento",nullable = false)
    private LocalTime FechaFinTratamiento;
    @Column(name = "HorasTratamiento",nullable = false)
    private int HorasTratamiento;
    @Column(name = "EfectosEsperadosTratamiento",nullable = false, length = 200)
    private String EfectosEsperadosTratamiento;
    @ManyToOne
    @JoinColumn(name = "oncologoId")
    private Oncologo oncologo;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String descripcionTratamiento, String estadoTratamiento, int presupuestoTratamiento, LocalDate fechaTratamiento, LocalTime fechaFinTratamiento, int horasTratamiento, String efectosEsperadosTratamiento, Oncologo oncologo) {
        this.idTratamiento = idTratamiento;

        DescripcionTratamiento = descripcionTratamiento;
        EstadoTratamiento = estadoTratamiento;
        PresupuestoTratamiento = presupuestoTratamiento;
        FechaTratamiento = fechaTratamiento;
        FechaFinTratamiento = fechaFinTratamiento;
        HorasTratamiento = horasTratamiento;
        EfectosEsperadosTratamiento = efectosEsperadosTratamiento;
        this.oncologo = oncologo;
    }

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
    }

    public String getDescripcionTratamiento() {
        return DescripcionTratamiento;
    }

    public void setDescripcionTratamiento(String descripcionTratamiento) {
        DescripcionTratamiento = descripcionTratamiento;
    }

    public String getEstadoTratamiento() {
        return EstadoTratamiento;
    }

    public void setEstadoTratamiento(String estadoTratamiento) {
        EstadoTratamiento = estadoTratamiento;
    }

    public int getPresupuestoTratamiento() {
        return PresupuestoTratamiento;
    }

    public void setPresupuestoTratamiento(int presupuestoTratamiento) {
        PresupuestoTratamiento = presupuestoTratamiento;
    }

    public LocalDate getFechaTratamiento() {
        return FechaTratamiento;
    }

    public void setFechaTratamiento(LocalDate fechaTratamiento) {
        FechaTratamiento = fechaTratamiento;
    }

    public LocalTime getFechaFinTratamiento() {
        return FechaFinTratamiento;
    }

    public void setFechaFinTratamiento(LocalTime fechaFinTratamiento) {
        FechaFinTratamiento = fechaFinTratamiento;
    }

    public int getHorasTratamiento() {
        return HorasTratamiento;
    }

    public void setHorasTratamiento(int horasTratamiento) {
        HorasTratamiento = horasTratamiento;
    }

    public String getEfectosEsperadosTratamiento() {
        return EfectosEsperadosTratamiento;
    }

    public void setEfectosEsperadosTratamiento(String efectosEsperadosTratamiento) {
        EfectosEsperadosTratamiento = efectosEsperadosTratamiento;
    }

    public Oncologo getOncologo() {
        return oncologo;
    }

    public void setOncologo(Oncologo oncologo) {
        this.oncologo = oncologo;
    }
}
