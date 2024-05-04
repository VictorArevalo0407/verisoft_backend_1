package pe.edu.upc.verisoft_backend_1.dtos;



public class SeguroDTO {
    private int Seguro_ID;

    private String TipoSeguro;

    private String DescSeguro;

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
