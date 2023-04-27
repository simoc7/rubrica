package io.simone.rubrica.controller;

import io.simone.rubrica.model.Contatto;
import io.simone.rubrica.service.RubricaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/rubrica")
//@CrossOrigin(origins = "http://localhost:4200")
public class RubricaController {
    private final RubricaService rubricaService;

    @Autowired
    public RubricaController(/*@Qualifier(value = "rubrica") */RubricaService rubricaService) {
        this.rubricaService = rubricaService;
    }

    @GetMapping(path = "/hw")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/all")
    public List<Contatto> getAllContatti() {
        return rubricaService.getAllContatti();
    }
    @GetMapping(path = "/{id}")
    public Contatto getContatto(@PathVariable Integer id) {
        return rubricaService.getContatto(id);
    }
}
