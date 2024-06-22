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
    @Column(name = "HorasTratamiento",nullable = false)
    private int HorasTratamiento;
    @Column(name = "EfectosEsperadosTratamiento",nullable = false, length = 200)
    private String EfectosEsperadosTratamiento;
    @ManyToOne
    @JoinColumn(name = "oncologoId")
    private Oncologo oncologo;
    @ManyToOne
    @JoinColumn(name = "tipoTratamientoId")
    private TipoTratamiento tipoTratamiento;

    @ManyToOne
    @JoinColumn(name = "citaId")
    private Cita cita;

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String descripcionTratamiento, String estadoTratamiento, int presupuestoTratamiento, LocalDate fechaTratamiento, int horasTratamiento, String efectosEsperadosTratamiento, Oncologo oncologo, TipoTratamiento tipoTratamiento, Cita cita) {
        this.idTratamiento = idTratamiento;
        DescripcionTratamiento = descripcionTratamiento;
        EstadoTratamiento = estadoTratamiento;
        PresupuestoTratamiento = presupuestoTratamiento;
        FechaTratamiento = fechaTratamiento;
        HorasTratamiento = horasTratamiento;
        EfectosEsperadosTratamiento = efectosEsperadosTratamiento;
        this.oncologo = oncologo;
        this.tipoTratamiento = tipoTratamiento;
        this.cita = cita;
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

    public TipoTratamiento getTipoTratamiento() {
        return tipoTratamiento;
    }

    public void setTipoTratamiento(TipoTratamiento tipoTratamiento) {
        this.tipoTratamiento = tipoTratamiento;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
}
