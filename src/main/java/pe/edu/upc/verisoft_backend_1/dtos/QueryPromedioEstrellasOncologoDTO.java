package pe.edu.upc.verisoft_backend_1.dtos;

public class QueryPromedioEstrellasOncologoDTO {
    private String nombreyapellido;
    private float promedioestrellas;

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public float getPromedioestrellas() {
        return promedioestrellas;
    }

    public void setPromedioestrellas(float promedioestrellas) {
        this.promedioestrellas = promedioestrellas;
    }
}
