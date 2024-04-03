package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name= "Especialidad")
public class Especialidad {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreEspecialidad",nullable = false,length = 30)
    private String nombreEspecialidad;
    @Column(name="complejidad",nullable = false,length = 30)
    private String complejidad;

    public Especialidad() {
    }

    public Especialidad(int id, String nombreEspecialidad, String complejidad) {
        this.id = id;
        this.nombreEspecialidad = nombreEspecialidad;
        this.complejidad = complejidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getComplejidad() {
        return complejidad;
    }

    public void setComplejidad(String complejidad) {
        this.complejidad = complejidad;
    }
}
