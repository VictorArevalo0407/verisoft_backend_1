package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import pe.edu.upc.verisoft_backend_1.entities.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
    public void insert(Role role);
    public void delete(int id);
    public Role listId(int id);
}
