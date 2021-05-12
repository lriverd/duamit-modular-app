package cl.duamit.shared.infrastructure.providers.rest;

import cl.duamit.shared.domain.entities.Pharmacy;
import cl.duamit.shared.domain.repositories.PharmacysTurn;
import cl.duamit.shared.infrastructure.providers.rest.mapper.PharmacyRestMapper;
import cl.duamit.shared.infrastructure.providers.rest.model.PharmacyRest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@ConfigurationProperties(prefix = "pharmacy.turns")
public class PharmacysTurnService extends RestService implements PharmacysTurn {

	@Autowired
	PharmacyRestMapper pharmacyRestMapper;

	public List<PharmacyRest> getRestPharmacy() {
		//this.buildUrl();
		setConverter();
		getHttpHeaders().setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(getHttpHeaders());
		ResponseEntity<List<PharmacyRest>> rateResponse =
//			getRestTemplate().exchange("https://farmanet.minsal.cl/index.php/ws/getLocalesTurnos",
			getRestTemplate().exchange(getTmplUrl(),
				HttpMethod.GET,
				requestEntity,
				new ParameterizedTypeReference<List<PharmacyRest>>() {
				});
		return rateResponse.getBody();
	}

	@Override
	public List<Pharmacy> getOpenPharmacy() {
		List<Pharmacy> pharmacyList = new ArrayList<>();
		getRestPharmacy().stream().forEach(prl -> {
			try {
				pharmacyList.add(pharmacyRestMapper.toPharmacy(prl));
			} catch (Exception e) {
				log.error("Cannot parse rest pharmacy", e);
			}
		});
		return pharmacyList;
	}
}
