package pe.edu.upc.verisoft_backend_1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "oncologo")
public class Oncologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oncologo_id;
}
