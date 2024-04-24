package pe.edu.upc.verisoft_backend_1.dtos;
import pe.edu.upc.verisoft_backend_1.entities.Respuesta;
import pe.edu.upc.verisoft_backend_1.entities.Users;

public class PacienteDTO {
    private int idPaciente;
    private Respuesta respuesta;
    private Users user;
    private String contactoEmergencia;
    private String estado;

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
