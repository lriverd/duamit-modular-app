package cl.duamit.shared.domain.repositories;

import cl.duamit.shared.domain.entities.Bank;

import java.util.List;

public interface BanksRepository {
	List<Bank> getAllBanks();
}
