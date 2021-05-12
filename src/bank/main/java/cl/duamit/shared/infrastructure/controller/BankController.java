package cl.duamit.shared.infrastructure.controller;

import cl.duamit.shared.domain.entities.Bank;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/bank")
public class BankController {

	private static final String BY_GEOLOCATION = "/";

	@Operation(summary = "Get nearby pharmacys by geolocation coordinates")
	@ApiResponse(responseCode = "200", description = "Found a list of pharmacies",
		content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Bank.class))})
	@GetMapping(value = BY_GEOLOCATION, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Object> getAllBanks(HttpServletRequest request) throws Exception {
		return ResponseEntity.ok("All OK");
	}

}
