package io.simone.rubrica.dto;

import lombok.Data;

@Data
public class ContattoDTO {
    private Integer id;
    private String nome;
    private String cognome;
    private Long numeroCellulare;
}
