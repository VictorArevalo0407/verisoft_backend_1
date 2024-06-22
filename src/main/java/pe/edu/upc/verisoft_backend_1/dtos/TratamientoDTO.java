package pe.edu.upc.verisoft_backend_1.dtos;

import pe.edu.upc.verisoft_backend_1.entities.Cita;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;
import pe.edu.upc.verisoft_backend_1.entities.TipoTratamiento;

import java.time.LocalDate;
import java.time.LocalTime;

public class TratamientoDTO {
    private int idTratamiento;
    private String DescripcionTratamiento;
    private String EstadoTratamiento;
    private int PresupuestoTratamiento;
    private LocalDate FechaTratamiento;
    private int HorasTratamiento;
    private String EfectosEsperadosTratamiento;
    private Oncologo oncologo;
    private TipoTratamiento tipoTratamiento;
    private Cita cita;

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
