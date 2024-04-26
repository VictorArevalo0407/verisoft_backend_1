package pe.edu.upc.verisoft_backend_1.dtos;

import pe.edu.upc.verisoft_backend_1.entities.Especialidad;
import pe.edu.upc.verisoft_backend_1.entities.Users;

import java.math.BigDecimal;

public class OncologoDTO {
    private int oncologo_id;

    private Users user_id;

    private Especialidad especialidad_id;

    private int experiencia_laboral_anios;

    private int cantidad_pacientes;

    private int edad;


    private String horario_atencion;

    private BigDecimal salario;

    private String nombreyapellido;

    public int getOncologo_id() {
        return oncologo_id;
    }

    public void setOncologo_id(int oncologo_id) {
        this.oncologo_id = oncologo_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public Especialidad getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(Especialidad especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public int getExperiencia_laboral_anios() {
        return experiencia_laboral_anios;
    }

    public void setExperiencia_laboral_anios(int experiencia_laboral_anios) {
        this.experiencia_laboral_anios = experiencia_laboral_anios;
    }

    public int getCantidad_pacientes() {
        return cantidad_pacientes;
    }

    public void setCantidad_pacientes(int cantidad_pacientes) {
        this.cantidad_pacientes = cantidad_pacientes;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHorario_atencion() {
        return horario_atencion;
    }

    public void setHorario_atencion(String horario_atencion) {
        this.horario_atencion = horario_atencion;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }
}
