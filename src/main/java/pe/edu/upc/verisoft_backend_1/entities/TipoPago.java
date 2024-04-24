package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoPago")
public class TipoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int TipoPagoID;
    @Column(name = "MetodoPago",nullable = false,length =50)
    private String MetodoPago;
    @Column(name = "Cuotas",nullable = false)
    private int Cuotas;
    @Column(name = "PorcentajeDescuento",nullable = false)
    private int PorcentajeDescuento;

    public TipoPago() {
    }

    public TipoPago(int tipoPagoID, String metodoPago, int cuotas, int porcentajeDescuento) {
        TipoPagoID = tipoPagoID;
        MetodoPago = metodoPago;
        Cuotas = cuotas;
        PorcentajeDescuento = porcentajeDescuento;
    }

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
