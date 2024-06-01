package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Seguro")

public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idseguro;
    @Column(name = "nombre", nullable = false, length = 25)
    private String nombreseguro;
    @Column(name = "tipo", nullable = false, length = 25)
    private String tiposeguro;

    public Seguro() {

    }

    public Seguro(int idseguro, String nombreseguro, String tiposeguro) {
        this.idseguro = idseguro;
        this.nombreseguro = nombreseguro;
        this.tiposeguro = tiposeguro;
    }

    public int getIdseguro() {
        return idseguro;
    }

    public void setIdseguro(int idseguro) {
        this.idseguro = idseguro;
    }

    public String getNombreseguro() {
        return nombreseguro;
    }

    public void setNombreseguro(String nombreseguro) {
        this.nombreseguro = nombreseguro;
    }

    public String getTiposeguro() {
        return tiposeguro;
    }

    public void setTiposeguro(String tiposeguro) {
        this.tiposeguro = tiposeguro;
    }
}
