package cl.duamit.shared.infrastructure.providers.db.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "bank")
public class Bank {
	@Id
	private String code;
	private String rut;
	private String name;

}
