package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.verisoft_backend_1.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
