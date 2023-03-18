package cl.duamit.banks.infrastructure.providers.db;

import cl.duamit.banks.domain.entities.Bank;
import cl.duamit.banks.domain.repositories.BanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class DbBankRepository implements BanksRepository {

	@Autowired
	private DbRepository dbRepository;

	@Override
	public List<Bank> getAllBanks() {
		return dbRepository.findAll().stream().map(BankMapper::toDomainBank).collect(Collectors.toList());
	}
}
