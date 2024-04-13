package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Role;
import pe.edu.upc.verisoft_backend_1.repositories.RoleRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplements implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Role listId(int id) {
        return rR.findById(id).orElse(new Role());
    }
}
