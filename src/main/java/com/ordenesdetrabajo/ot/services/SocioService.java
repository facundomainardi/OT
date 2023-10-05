package com.ordenesdetrabajo.ot.services;

import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.dto.SocioDTO;
import com.ordenesdetrabajo.ot.model.Personal;
import com.ordenesdetrabajo.ot.model.Socio;

import java.util.List;

public interface SocioService {
    List<SocioDTO> getAll();

    void saveSocio(Socio socio);

    Socio findById(Long id);

    SocioDTO getSocioDTO(long id);

   // Socio findByDNI(String dni);
}
