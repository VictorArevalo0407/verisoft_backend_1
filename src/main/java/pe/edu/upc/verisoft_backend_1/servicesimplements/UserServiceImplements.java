package pe.edu.upc.verisoft_backend_1.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.verisoft_backend_1.entities.Users;
import pe.edu.upc.verisoft_backend_1.repositories.UserRepository;
import pe.edu.upc.verisoft_backend_1.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplements implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Users listId(Long id) {
        return uR.findById(id).orElse(new Users());
    }


}
