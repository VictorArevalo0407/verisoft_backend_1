package pe.edu.upc.verisoft_backend_1.dtos;

import pe.edu.upc.verisoft_backend_1.entities.Users;

public class RoleDTO {
    private int id;
    private String rol;
    private Users user;

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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}

