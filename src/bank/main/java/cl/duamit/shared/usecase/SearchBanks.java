package cl.duamit.shared.usecase;

import cl.duamit.shared.domain.entities.Bank;
import cl.duamit.shared.domain.repositories.BanksRepository;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SearchBanks {

	private BanksRepository banksRepository;

	@SneakyThrows
	public List<Bank> getAllBanks() {
		return banksRepository.getAllBanks();
	}
}
