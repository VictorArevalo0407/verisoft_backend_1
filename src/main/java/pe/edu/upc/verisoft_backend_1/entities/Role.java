package pe.edu.upc.verisoft_backend_1.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id"}) })
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String rol;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonBackReference
    private Users user;

    public Role() {
    }

    public Role(int id, String rol, Users user) {
        this.id = id;
        this.rol = rol;
        this.user = user;
    }

    //GETTERS AND SETTERES

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

}



