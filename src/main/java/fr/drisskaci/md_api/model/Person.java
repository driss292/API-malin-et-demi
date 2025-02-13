package fr.drisskaci.md_api.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
}
