package cl.duamit.banks.domain.repositories;

import cl.duamit.banks.domain.entities.Bank;

import java.util.List;

public interface BanksRepository {
	List<Bank> getAllBanks();
}
