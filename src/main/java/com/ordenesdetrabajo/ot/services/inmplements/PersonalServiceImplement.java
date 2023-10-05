package com.ordenesdetrabajo.ot.services.inmplements;

import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.model.Personal;
import com.ordenesdetrabajo.ot.repositories.PersonalRepository;
import com.ordenesdetrabajo.ot.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class PersonalServiceImplement  implements PersonalService {

    @Autowired
    private PersonalRepository personalRepository;
    @Override
    public List<PersonalDTO> getAll() {
        return personalRepository.findAll().stream().map(PersonalDTO::new).collect(toList());
    }

    @Override
    public void savePersonal(Personal personal) {
    personalRepository.save(personal);
    }

    @Override
    public Personal findById(Long id) {
        return personalRepository.findById(id).orElse(null);
    }

    @Override
    public PersonalDTO getPersonalDTO(long id) {
        return new PersonalDTO(this.findById(id));
    }

//    @Override
//    public Personal findByDNI(String dni) {
//        return  personalRepository.findByDNI(dni);
//    }
}
