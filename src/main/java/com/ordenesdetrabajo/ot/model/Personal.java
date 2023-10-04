package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


@Entity

public class Personal extends Persona {

    private Cargo cargo;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="cuadrilla_id")
    private Cuadrilla cuadrilla;

    public Personal(){

    }
    public Personal(String firstName, String lastName, String email, String dni, Cargo cargo) {
        super(firstName, lastName, email, dni);
        this.cargo = cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Cuadrilla getCuadrilla() {
        return cuadrilla;
    }

    public void setCuadrilla(Cuadrilla cuadrilla) {
        this.cuadrilla = cuadrilla;
    }
}