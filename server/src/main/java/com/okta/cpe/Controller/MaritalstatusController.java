package com.okta.cpe.Controller;

import com.okta.cpe.Entity.*;
import com.okta.cpe.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
public class MaritalstatusController {

    @Autowired
    private final MaritalstatusRepository maritalstatusRepository;

    public MaritalstatusController(MaritalstatusRepository maritalstatusRepository) {
        this.maritalstatusRepository = maritalstatusRepository;
    }

    @GetMapping("/maritalstatus")
    public Collection<Maritalstatus> Maritalstatus() {
        return maritalstatusRepository.findAll().stream().collect(Collectors.toList());
    }

}