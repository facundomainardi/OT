package com.ordenesdetrabajo.ot.services.inmplements;

import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.dto.SocioDTO;
import com.ordenesdetrabajo.ot.model.Personal;
import com.ordenesdetrabajo.ot.model.Socio;
import com.ordenesdetrabajo.ot.repositories.SocioRepository;
import com.ordenesdetrabajo.ot.services.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class SocioServiceImplement implements SocioService {

    @Autowired
    SocioRepository socioRepository;
    @Override
    public List<SocioDTO> getAll() {
        return socioRepository.findAll().stream().map(SocioDTO::new).collect(toList());

    }

    @Override
    public void saveSocio(Socio socio) {
socioRepository.save(socio);
    }

    @Override
    public Socio findById(Long id) {
        return  socioRepository.findById(id).orElse(null);
    }

    @Override
    public SocioDTO getSocioDTO(long id) {
        return new SocioDTO(this.findById(id));
    }

//    @Override
//    public Socio findByDNI(String dni) {
//        return socioRepository.findByDNI(dni);
//    }
}
