package cl.duamit.banks.usecase;

import cl.duamit.banks.domain.repositories.BanksRepository;
import cl.duamit.banks.domain.entities.Bank;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BanksUseCase {

	@Autowired
	private BanksRepository banksRepository;

	@SneakyThrows
	public List<Bank> getAllBanks() {
		return banksRepository.getAllBanks();
	}
}
