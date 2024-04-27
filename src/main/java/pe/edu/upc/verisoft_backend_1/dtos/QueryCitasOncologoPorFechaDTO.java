package pe.edu.upc.verisoft_backend_1.dtos;

import java.time.LocalDate;

public class QueryCitasOncologoPorFechaDTO {
    private String nombreyapellido;
    private int cantidadcitas;
    private LocalDate fecha;

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public int getCantidadcitas() {
        return cantidadcitas;
    }

    public void setCantidadcitas(int cantidadcitas) {
        this.cantidadcitas = cantidadcitas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
