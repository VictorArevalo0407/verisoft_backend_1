package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "alergias")
public class Alergias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idalergias;
    @Column(name = "Descripcionalergias", nullable = false,length = 150)
    private String descripcionAlergias;

    public Alergias() {
    }

    public int getIdalergias() {
        return idalergias;
    }

    public void setIdalergias(int idalergias) {
        this.idalergias = idalergias;
    }

    public String getDescripcionAlergias() {
        return descripcionAlergias;
    }

    public void setDescripcionAlergias(String descripcionAlergias) {
        this.descripcionAlergias = descripcionAlergias;
    }
}
