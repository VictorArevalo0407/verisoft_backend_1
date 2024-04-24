package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Respuesta")

public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRespuesta;
    @Column(name = "gradoConsulta", nullable = false, length = 50)
    private String gradoConsulta;
    @Column(name = "nivelRespuesta", nullable = false, length = 400)

    private String nivelRespuesta;

    public Respuesta() {
    }

    public Respuesta(int idRespuesta, String gradoConsulta, String nivelRespuesta) {
        this.idRespuesta = idRespuesta;
        this.gradoConsulta = gradoConsulta;
        this.nivelRespuesta = nivelRespuesta;
    }

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
