package pe.edu.upc.verisoft_backend_1.dtos;

public class SeguroDTO {
    private int idSeguro;

    private String TipoSeguro;

    private String DescSeguro;

    public int getIdSeguro() {
        return idSeguro;
    }

    public void setIdSeguro(int idSeguro) {
        this.idSeguro = idSeguro;
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
