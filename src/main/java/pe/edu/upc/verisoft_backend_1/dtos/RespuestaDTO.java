package pe.edu.upc.verisoft_backend_1.dtos;

public class RespuestaDTO {
    private int idRespuesta;
    private String gradoConsulta;

    private String nivelRespuesta;

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
}
