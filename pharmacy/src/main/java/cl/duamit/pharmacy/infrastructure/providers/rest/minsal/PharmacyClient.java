package cl.duamit.pharmacy.infrastructure.providers.rest.minsal;

import cl.duamit.pharmacy.infrastructure.providers.rest.AbstractRestService;
import cl.duamit.pharmacy.infrastructure.providers.rest.model.PharmacyRest;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "pharmacy.premises")
public class PharmacyClient extends AbstractRestService {

	public List<PharmacyRest> getAllPharmacy(){
		getHttpHeaders().setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<String>(getHttpHeaders());
		ResponseEntity<List<PharmacyRest>> rateResponse =
			getRestTemplate().exchange(getUrl(),
				HttpMethod.GET,
				requestEntity,
				new ParameterizedTypeReference<List<PharmacyRest>>() {
				});
		List<PharmacyRest> rates = rateResponse.getBody();
		return rates;
	}
}
