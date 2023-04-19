package cl.duamit.banks.infrastructure.providers.db.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "BNK_BANK")
public class Bank {
	@Id
	@Column(name = "bnk_id")
	private String code;
	@Column(name = "bnk_rut")
	private String rut;
	@Column(name = "bnk_name")
	private String name;

}
