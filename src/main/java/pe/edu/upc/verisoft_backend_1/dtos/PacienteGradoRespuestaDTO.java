package pe.edu.upc.verisoft_backend_1.dtos;

public class PacienteGradoRespuestaDTO {
    private int idPaciente;
    private String estado;
    private String gradoConsulta;
    private int cantidadTotalRespuestas;

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGradoConsulta() {
        return gradoConsulta;
    }

    public void setGradoConsulta(String gradoConsulta) {
        this.gradoConsulta = gradoConsulta;
    }

    public int getCantidadTotalRespuestas() {
        return cantidadTotalRespuestas;
    }

    public void setCantidadTotalRespuestas(int cantidadTotalRespuestas) {
        this.cantidadTotalRespuestas = cantidadTotalRespuestas;
    }
}
