package cl.duamit.shared.domain.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Coordinates {
	private double latitude;
	private double longitude;
	private double altitude;
}
