package pe.edu.upc.verisoft_backend_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.verisoft_backend_1.entities.Users;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Long> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE
    @Query("select count(u.username) from Users u where u.username =:username")
    public long buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Integer user_id);

    @Query(value = "SELECT r.rol, COUNT(u.id) FROM users u \n" +
            "INNER JOIN roles r ON r.user_id = u.id\n" +
            "GROUP BY r.rol ORDER BY COUNT(u.id) desc",nativeQuery = true)
    public List<String[]> quantityRolbyUser();
}
