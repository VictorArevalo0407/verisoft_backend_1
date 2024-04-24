package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.TipoPago;
import java.util.List;

public interface TipoPagoService {
    public void insert (TipoPago tipopago);
    public List<TipoPago> list();

}
