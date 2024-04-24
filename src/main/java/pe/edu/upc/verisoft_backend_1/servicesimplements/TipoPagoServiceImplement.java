package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.TipoPago;
import pe.edu.upc.verisoft_backend_1.repositories.TipoPagoRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.TipoPagoService;

import java.util.List;

@Service
public class TipoPagoServiceImplement implements TipoPagoService {
@Autowired
    private TipoPagoRepository tR;
    @Override
    public void insert(TipoPago tipopago) {
tR.save(tipopago);
    }
    @Override
    public List<TipoPago> list() {
        return tR.findAll();
    }
}
