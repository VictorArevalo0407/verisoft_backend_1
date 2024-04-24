package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Oncologo")
public class Oncologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oncologoId;
}
