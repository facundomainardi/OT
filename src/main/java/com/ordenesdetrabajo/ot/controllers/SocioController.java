package com.ordenesdetrabajo.ot.controllers;

import com.ordenesdetrabajo.ot.dto.PersonalDTO;
import com.ordenesdetrabajo.ot.dto.SocioDTO;
import com.ordenesdetrabajo.ot.services.SocioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SocioController {

    @Autowired
    SocioService socioService;

    @RequestMapping("/socios")
    public List<SocioDTO> getSocios() {
        return  socioService.getAll();
    }

    @RequestMapping("/socio/{id}")
    public SocioDTO getSocio(@PathVariable Long id) {
        return socioService.getSocioDTO(id);
    }
}

