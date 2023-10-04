package com.ordenesdetrabajo.ot.dto;

import com.ordenesdetrabajo.ot.model.Cargo;
import com.ordenesdetrabajo.ot.model.Personal;

public class PersonalDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String dni;
    private Cargo cargo;

    public PersonalDTO() {
    }

    public PersonalDTO(Personal personal) {
        this.firstName = personal.getFirstName();
        this.lastName = personal.getLastName();
        this.email = personal.getEmail();
        this.dni = personal.getDni();
        this.cargo = personal.getCargo();
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

    public Cargo getCargo() {
        return cargo;
    }
}
