package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "cirugias")
public class Cirugias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcirugias;
    @Column(name ="Descripcioncirugias",nullable = false,length = 140)
    private String Descripcioncirugias;

    public Cirugias() {
    }

    public Cirugias(int idcirugias, String descripcioncirugias) {
        this.idcirugias = idcirugias;
        Descripcioncirugias = descripcioncirugias;
    }

    public int getIdcirugias() {
        return idcirugias;
    }

    public void setIdcirugias(int idcirugias) {
        this.idcirugias = idcirugias;
    }

    public String getDescripcioncirugias() {
        return Descripcioncirugias;
    }

    public void setDescripcioncirugias(String descripcioncirugias) {
        Descripcioncirugias = descripcioncirugias;
    }
}
