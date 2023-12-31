package com.ordenesdetrabajo.ot.controllers;

import com.ordenesdetrabajo.ot.model.Personal;
import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.repositories.PersonalRepository;
import com.ordenesdetrabajo.ot.services.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api")
public class PersonalController {
    @Autowired
    PersonalService personalService;

    @RequestMapping("/personals")
    public List<PersonalDTO> getPersonal() {
        return  personalService.getAll();
    }

    @RequestMapping("/personal/{id}")
    public PersonalDTO getPersonal(@PathVariable Long id) {
        return personalService.getPersonalDTO(id);
    }
}