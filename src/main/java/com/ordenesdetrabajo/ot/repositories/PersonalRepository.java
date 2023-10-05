package com.ordenesdetrabajo.ot.repositories;

import com.ordenesdetrabajo.ot.model.Persona;
import com.ordenesdetrabajo.ot.model.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonalRepository extends JpaRepository<Personal, Long> {
    Personal findByLastName(String lastName);
    Personal findByEmail(String email);

   // Personal findByDNI(String dni);

}
