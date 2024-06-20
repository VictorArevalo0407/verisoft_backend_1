package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @Column(name ="hora", nullable = false)
    private int hora;
    @Column(name ="motivo", nullable = false, length = 100)
    private String motivo;
    @Column(name ="estado", nullable = false, length = 20)
    private String estado;
    @Column(name ="consultorio", nullable = false, length = 20)
    private String  consultorio;
    @ManyToOne
    @JoinColumn(name ="PacienteId" )
    private Paciente paciente;
    @ManyToOne()
    @JoinColumn(name ="OncologoId")
    private Oncologo oncologo;

    public Cita() {
    }

    public Cita(int idCita, LocalDate fecha, int hora, String motivo, String estado, String consultorio, Paciente paciente, Oncologo oncologo) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
        this.consultorio = consultorio;
        this.paciente = paciente;
        this.oncologo = oncologo;
    }


    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Oncologo getOncologo() {
        return oncologo;
    }

    public void setOncologo(Oncologo oncologo) {
        this.oncologo = oncologo;
    }
}
