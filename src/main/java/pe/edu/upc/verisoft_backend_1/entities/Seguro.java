package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Seguro")

public class Seguro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Seguro_ID;
    @Column(name = "TipoSeguro", nullable = false, length = 25)
    private String TipoSeguro;
    @Column(name = "DescSeguro", nullable = false, length = 25)
    private String DescSeguro;

    public Seguro() {

    }

    public Seguro(int seguro_ID, String tipoSeguro, String descSeguro) {
        Seguro_ID = seguro_ID;
        TipoSeguro = tipoSeguro;
        DescSeguro = descSeguro;
    }

    public int getSeguro_ID() {
        return Seguro_ID;
    }

    public void setSeguro_ID(int seguro_ID) {
        Seguro_ID = seguro_ID;
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
