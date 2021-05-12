package cl.duamit.shared.domain.repositories;

import cl.duamit.shared.domain.entities.Pharmacy;

import java.util.List;

public interface PharmacysTurn {
	List<Pharmacy> getOpenPharmacy();
}
