package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaciente;
    @ManyToOne
    @JoinColumn(name = "respuestaId")
    private Respuesta respuesta;
    @ManyToOne
    @JoinColumn(name = "userId")
    private Users user;
    @Column(name="contactoEmergencia",nullable = false,length = 100)
    private String contactoEmergencia;
    @Column(name="estado",nullable = false,length = 1)
    private String estado;

    public Paciente() {
    }
    public Paciente(int idPaciente, Respuesta respuesta, Users user, String contactoEmergencia, String estado) {
        this.idPaciente = idPaciente;
        this.respuesta = respuesta;
        this.user = user;
        this.contactoEmergencia = contactoEmergencia;
        this.estado = estado;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Respuesta getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Respuesta respuesta) {
        this.respuesta = respuesta;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getContactoEmergencia() {
        return contactoEmergencia;
    }

    public void setContactoEmergencia(String contactoEmergencia) {
        this.contactoEmergencia = contactoEmergencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
