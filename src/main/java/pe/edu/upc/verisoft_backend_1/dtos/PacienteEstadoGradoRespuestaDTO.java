package pe.edu.upc.verisoft_backend_1.dtos;

public class PacienteEstadoGradoRespuestaDTO {
    private int idPaciente;
    private int cantidadTotalRespuestas;
    private String estadoConsulta;
    private String gradoConsulta;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getCantidadTotalRespuestas() {
        return cantidadTotalRespuestas;
    }

    public void setCantidadTotalRespuestas(int cantidadTotalRespuestas) {
        this.cantidadTotalRespuestas = cantidadTotalRespuestas;
    }

    public String getEstadoConsulta() {
        return estadoConsulta;
    }

    public void setEstadoConsulta(String estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }

    public String getGradoConsulta() {
        return gradoConsulta;
    }

    public void setGradoConsulta(String gradoConsulta) {
        this.gradoConsulta = gradoConsulta;
    }
}
