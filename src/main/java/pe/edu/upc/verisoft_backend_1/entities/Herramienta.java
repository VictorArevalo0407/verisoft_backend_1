package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Herramienta")
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int herramienta_id;
    @ManyToOne
    @JoinColumn(name = "oncologo_id")
    private Oncologo oncologo_id;
    @Column(name="nombreHerramienta",nullable = false,length = 30)
    private String nombreHerramienta;

    public Herramienta() {
    }

    public Herramienta(int herramienta_id, Oncologo oncologo_id, String nombreHerramienta) {
        this.herramienta_id = herramienta_id;
        this.oncologo_id = oncologo_id;
        this.nombreHerramienta = nombreHerramienta;
    }

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
