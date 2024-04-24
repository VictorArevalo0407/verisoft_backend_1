package pe.edu.upc.verisoft_backend_1.dtos;

public class TipoPagoDTO {
    private int TipoPagoID;
    private String MetodoPago;
    private int Cuotas;
    private int PorcentajeDescuento;

    public int getTipoPagoID() {
        return TipoPagoID;
    }

    public void setTipoPagoID(int tipoPagoID) {
        TipoPagoID = tipoPagoID;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        MetodoPago = metodoPago;
    }

    public int getCuotas() {
        return Cuotas;
    }

    public void setCuotas(int cuotas) {
        Cuotas = cuotas;
    }

    public int getPorcentajeDescuento() {
        return PorcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        PorcentajeDescuento = porcentajeDescuento;
    }
}
