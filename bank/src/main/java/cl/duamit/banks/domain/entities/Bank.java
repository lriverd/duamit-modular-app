package cl.duamit.banks.domain.entities;

import cl.duamit.shared.rut.Rut;
import lombok.Data;

@Data
public class Bank {
	private Rut rut;
	private String code;
	private String Name;
}
