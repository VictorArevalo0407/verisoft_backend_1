package pe.edu.upc.verisoft_backend_1.dtos;
import pe.edu.upc.verisoft_backend_1.entities.Paciente;

public class RespuestaDTO {
    private int idRespuesta;
    private String gradoConsulta;
    private String nivelRespuesta;
    private Paciente paciente;

    public int getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(int idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getGradoConsulta() {
        return gradoConsulta;
    }

    public void setGradoConsulta(String gradoConsulta) {
        this.gradoConsulta = gradoConsulta;
    }

    public String getNivelRespuesta() {
        return nivelRespuesta;
    }

    public void setNivelRespuesta(String nivelRespuesta) {
        this.nivelRespuesta = nivelRespuesta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
