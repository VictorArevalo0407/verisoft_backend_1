package pe.edu.upc.verisoft_backend_1.dtos;

import pe.edu.upc.verisoft_backend_1.entities.Oncologo;

import java.time.LocalDate;
import java.time.LocalTime;

public class TratamientoDTO {

    private int idTratamiento;

    private String DescripcionTratamiento;

    private String EstadoTratamiento;

    private int PresupuestoTratamiento;

    private LocalDate FechaTratamiento;

    private LocalTime FechaFinTratamiento;

    private int HorasTratamiento;

    private String EfectosEsperadosTratamiento;

    private Oncologo oncologo;

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
