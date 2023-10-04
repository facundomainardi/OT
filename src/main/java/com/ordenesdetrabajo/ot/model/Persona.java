package com.ordenesdetrabajo.ot.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


@MappedSuperclass
public class Persona {

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;

    private String dni;

public Persona(){

}

    public Persona(String first, String last, String email, String dni) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.dni = dni;
}



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
