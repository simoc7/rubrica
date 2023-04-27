package io.simone.rubrica.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Contatto {
	private static int AUTOINCREMENT = 0;

	@Setter(AccessLevel.NONE)
	private int id;
	private String nome;
	private String cognome;
	private long numeroCellulare;

	public Contatto(String nome, String cognome, long numeroCellulare) {
		this.id = AUTOINCREMENT++;
		this.nome = nome;
		this.cognome = cognome;
		this.numeroCellulare = numeroCellulare;
	}

	public void chiama() {

	}
}
