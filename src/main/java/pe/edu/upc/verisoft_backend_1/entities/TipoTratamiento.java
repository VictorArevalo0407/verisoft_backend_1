package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "TipoTratamiento")
public class TipoTratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreTratamiento",nullable = false,length = 30)
    private String nombreTratamiento;

    public TipoTratamiento() {
    }

    public TipoTratamiento(int id, String nombreTratamiento) {
        this.id = id;
        this.nombreTratamiento = nombreTratamiento;
    }

    public int getId() {
        return id;
    }

    public String getNombreTratamiento() {
        return nombreTratamiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreTratamiento(String nombreTratamiento) {
        this.nombreTratamiento = nombreTratamiento;
    }
}
