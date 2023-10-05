package com.ordenesdetrabajo.ot.dto;


import com.ordenesdetrabajo.ot.model.Estado;
import com.ordenesdetrabajo.ot.model.Socio;

public class SocioDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String dni;
    private String calle;
    private int numeroPuerta;
    private Estado estado;

    public SocioDTO() {
    }

    public SocioDTO(Socio socio) {
        this.firstName = socio.getFirstName();
        this.lastName = socio.getLastName();
        this.email = socio.getEmail();
        this.dni = socio.getDni();
        this.calle = socio.getCalle();
        this.numeroPuerta = socio.getNumeroPuerta();
        this.estado= socio.getEstado();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDni() {
        return dni;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public Estado getEstado() {
        return estado;
    }
}
