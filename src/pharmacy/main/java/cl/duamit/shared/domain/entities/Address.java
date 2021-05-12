package cl.duamit.shared.domain.entities;

import lombok.Data;

@Data
public class Address {
	private String address;
	private String locality;
	private Coordinates coordinates;
}
