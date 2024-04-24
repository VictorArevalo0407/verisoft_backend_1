package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Seguro")

public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SeguroId;
    @Column(name = "TipoSeguro", nullable = false, length = 25)
    private String TipoSeguro;
    @Column(name = "DescSeguro", nullable = false, length = 25)
    private String DescSeguro;

    public Seguro() {

    }
    public Seguro(int idSeguro, String tipoSeguro, String descSeguro) {
        this.SeguroId = idSeguro;
        TipoSeguro = tipoSeguro;
        DescSeguro = descSeguro;
    }


    public int getIdSeguro() {
        return SeguroId;
    }

    public void setIdSeguro(int idSeguro) {
        this.SeguroId = idSeguro;
    }

    public String getTipoSeguro() {
        return TipoSeguro;
    }

    public void setTipoSeguro(String tipoSeguro) {
        TipoSeguro = tipoSeguro;
    }

    public String getDescSeguro() {
        return DescSeguro;
    }

    public void setDescSeguro(String descSeguro) {
        DescSeguro = descSeguro;
    }
}
