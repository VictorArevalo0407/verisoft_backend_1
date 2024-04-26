package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Oncologo")
public class Oncologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oncologo_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user_id;
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad_id;
    @Column(name = "experiencia_laboral_anios", nullable = false)
    private int experiencia_laboral_anios;
    @Column(name = "cantidad_pacientes", nullable = false)
    private int cantidad_pacientes;
    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "horario_atencion", length = 100)
    private String horario_atencion;
    @Column(name = "salario", nullable = false)
    private BigDecimal salario;

    @Column(name = "nombreyapellido", length=200)
    private String nombreyapellido;


    public Oncologo() {
    }

    public Oncologo(int oncologo_id, Users user_id, Especialidad especialidad_id, int experiencia_laboral_anios, int cantidad_pacientes, int edad, String horario_atencion, BigDecimal salario, String nombreyapellido) {
        this.oncologo_id = oncologo_id;
        this.user_id = user_id;
        this.especialidad_id = especialidad_id;
        this.experiencia_laboral_anios = experiencia_laboral_anios;
        this.cantidad_pacientes = cantidad_pacientes;
        this.edad = edad;
        this.horario_atencion = horario_atencion;
        this.salario = salario;
        this.nombreyapellido=nombreyapellido;
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

    public int getOncologo_id() {
        return oncologo_id;
    }

    public void setOncologo_id(int oncologo_id) {
        this.oncologo_id = oncologo_id;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }
}

