package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.verisoft_backend_1.entities.TipoPago;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago,Integer> {

}