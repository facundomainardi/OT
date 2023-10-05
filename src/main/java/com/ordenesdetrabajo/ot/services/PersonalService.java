package com.ordenesdetrabajo.ot.services;

import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.model.Personal;

import java.util.List;

public interface PersonalService {
    List<PersonalDTO> getAll();

    void savePersonal(Personal personal);

    Personal findById(Long id);

    PersonalDTO getPersonalDTO(long id);

    //Personal findByDNI(String dni);
}
