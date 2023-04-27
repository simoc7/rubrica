package io.simone.rubrica.service;

import io.simone.rubrica.model.Contatto;

import java.util.List;

public interface RubricaService {
    List<Contatto> getAllContatti();
    Contatto getContatto(Integer id);
}
