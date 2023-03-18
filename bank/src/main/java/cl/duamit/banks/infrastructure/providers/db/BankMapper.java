package cl.duamit.banks.infrastructure.providers.db;

import cl.duamit.banks.domain.entities.Bank;
import cl.duamit.shared.rut.RutMapper;

public class BankMapper {

	public static Bank toDomainBank(cl.duamit.banks.infrastructure.providers.db.model.Bank bank){
		Bank response = new Bank();
		response.setCode(bank.getCode());
		response.setName(bank.getName());
		response.setRut(RutMapper.build().parse(bank.getRut()));

		return response;
	}
}
