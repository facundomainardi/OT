package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Cuadrilla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String descripcion;

    @OneToMany(mappedBy="cuadrilla", fetch=FetchType.EAGER)
    private Set<Personal> personals = new HashSet<>();

    public Cuadrilla() {
    }

    public Cuadrilla(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Set<Personal> getPersonals() {
        return personals;
    }

    public void setPersonals(Set<Personal> personals) {
        this.personals = personals;
    }

    public void addPersonal(Personal personal) {
        personal.setCuadrilla(this);
        personals.add(personal);
    }
}
