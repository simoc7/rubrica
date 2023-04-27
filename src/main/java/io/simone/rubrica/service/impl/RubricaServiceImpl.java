package io.simone.rubrica.service.impl;

import io.simone.rubrica.model.Contatto;
import io.simone.rubrica.service.RubricaService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
//@Qualifier(value = "rubrica")
public class RubricaServiceImpl implements RubricaService {
    private List<Contatto> contatti = new ArrayList<>();

    public RubricaServiceImpl() {
        contatti.add(new Contatto("simone", "rossi",3458956521L));
        contatti.add(new Contatto("antonio", "verdi",3458956522L));
        contatti.add(new Contatto("giuseppe", "bianchi",3458956523L));
    }

    @Override
    public List<Contatto> getAllContatti() {
        return contatti;
    }

    @Override
    public Contatto getContatto(Integer id) {
        for (Contatto contatto : contatti) {
            if (contatto.getId() == id.intValue()) return contatto;
        }
        return null;
    }
}
