package pe.edu.upc.verisoft_backend_1.dtos;
import java.time.LocalDate;

public class ExamenDeteccionDTO {
    private int examenDeteccionId;
    private LocalDate Fecha;
    private int hora;
    private String tipoExamen;
    private String resultados;

    public int getExamenDeteccionId() {
        return examenDeteccionId;
    }

    public void setExamenDeteccionId(int examenDeteccionId) {
        this.examenDeteccionId = examenDeteccionId;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}
