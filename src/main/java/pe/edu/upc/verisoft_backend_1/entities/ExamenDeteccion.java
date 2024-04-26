package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "ExamenDeteccion")
public class ExamenDeteccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examenDeteccionId;
    @Column(name = "Fecha",nullable=false)
    private LocalDate Fecha;
    @Column(name = "hora",nullable=false)
    private int hora;
    @Column(name = "tipoExamen",nullable=false,length =50)
    private String tipoExamen;
    @Column(name = "resultados",nullable=false,length =100)
    private String resultados;

    public ExamenDeteccion() {
    }

    public ExamenDeteccion(int examenDeteccionId, LocalDate fecha, int hora, String tipoExamen, String resultados) {
        this.examenDeteccionId = examenDeteccionId;
        Fecha = fecha;
        this.hora = hora;
        this.tipoExamen = tipoExamen;
        this.resultados = resultados;
    }

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
        this.Fecha = fecha;
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
