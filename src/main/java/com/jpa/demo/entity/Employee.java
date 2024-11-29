package com.jpa.demo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
public class Employee {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @NotNull(message = "Name is mandatory")
    private String name;
    @Column(precision = 10)
    private Double salary;
    private String department;
    public Employee(){}


}
