package pe.edu.upc.verisoft_backend_1.servicesinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.verisoft_backend_1.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();
    public void insert(Users users);
    public void delete(Long id);
    public Users listId(Long id);

}
