package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
@Entity
public class Socio extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String calle;
    private int numeroPuerta;

    private Estado estado;

    public Socio(String first, String last, String email, String dni, String calle, int numeroPuerta, Estado estado) {
        super(first, last, email, dni);
        this.calle = calle;
        this.numeroPuerta = numeroPuerta;
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }
}
