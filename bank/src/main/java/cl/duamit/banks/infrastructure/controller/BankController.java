package cl.duamit.banks.infrastructure.controller;

import cl.duamit.banks.domain.entities.Bank;
import cl.duamit.banks.usecase.BanksUseCase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BankController extends AbstractController {

	@Autowired
	private BanksUseCase banksUseCase;

	@Operation(summary = "Get all listed banks")
	@ApiResponse(responseCode = "200", description = "Found a list of banks",
		content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Bank.class))})
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Bank> getAllBanks(HttpServletRequest request) throws Exception {
		return banksUseCase.getAllBanks();
	}

}
