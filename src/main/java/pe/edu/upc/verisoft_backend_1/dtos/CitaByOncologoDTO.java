package pe.edu.upc.verisoft_backend_1.dtos;

public class CitaByOncologoDTO {
    private String nameOnco;

    private int quantityCita;

    public String getNameOnco() {
        return nameOnco;
    }

    public void setNameOnco(String nameOnco) {
        this.nameOnco = nameOnco;
    }

    public int getQuantityCita() {
        return quantityCita;
    }

    public void setQuantityCita(int quantityCita) {
        this.quantityCita = quantityCita;
    }
}
