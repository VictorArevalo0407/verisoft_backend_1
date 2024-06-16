package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cirugias")
public class Cirugias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcirugias;
    @Column(name ="Descripcioncirugias",nullable = false,length = 140)
    private String descripcionCirugias;

    public Cirugias() {
    }

    public int getIdcirugias() {
        return idcirugias;
    }

    public void setIdcirugias(int idcirugias) {
        this.idcirugias = idcirugias;
    }

    public String getDescripcionCirugias() {
        return descripcionCirugias;
    }

    public void setDescripcionCirugias(String descripcionCirugias) {
        this.descripcionCirugias = descripcionCirugias;
    }
}
