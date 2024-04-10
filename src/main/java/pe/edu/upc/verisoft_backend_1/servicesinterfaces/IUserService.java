package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.verisoft_backend_1.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();
    public void insert(Users users);
    public void delete(int id);
    public Users listId(int id);
    public Users findByUsername(String username);
    public int buscarUsername(@Param("username") String nombre);
    public void insRol(@Param("rol") String authority, @Param("user_id") Integer user_id);
    public List<String[]> quantityRolbyUser();
}
