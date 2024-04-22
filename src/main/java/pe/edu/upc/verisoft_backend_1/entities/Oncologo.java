package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="oncologo")
public class Oncologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odontologo_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user_id;
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad_id;
    @Column(name = "experiencia_laboral_anios", nullable = false)
    private int experiencia_laboral_anios;
    @Column(name = "cantidad_pacientes", nullable = false)
    private int cantidad_pacientes;
    @Column(name = "horario_atencion", length = 100)
    private String horario_atencion;
    @Column(name = "salario", nullable = false)
    private BigDecimal salario;

}
