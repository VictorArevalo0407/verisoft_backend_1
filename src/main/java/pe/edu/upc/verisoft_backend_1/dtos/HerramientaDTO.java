package pe.edu.upc.verisoft_backend_1.dtos;

import jakarta.persistence.*;
import pe.edu.upc.verisoft_backend_1.entities.Oncologo;

public class HerramientaDTO {
    private int herramienta_id;
    private Oncologo oncologo_id;
    private String nombreHerramienta;

    public int getHerramienta_id() {
        return herramienta_id;
    }

    public void setHerramienta_id(int herramienta_id) {
        this.herramienta_id = herramienta_id;
    }

    public Oncologo getOncologo_id() {
        return oncologo_id;
    }

    public void setOncologo_id(Oncologo oncologo_id) {
        this.oncologo_id = oncologo_id;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }
}
