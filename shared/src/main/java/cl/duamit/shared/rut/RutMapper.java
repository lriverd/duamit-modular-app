package cl.duamit.shared.rut;

import java.util.Objects;

public class RutMapper {

	public static RutMapper build() {
		return new RutMapper();
	}

	public Rut parse(String rut) {
		if(Objects.isNull(rut)){
			return null;
		}

		String cleanRut = rut.replaceAll("\\.", "").replace("-", "");
		String mantisa = cleanRut.substring(0, cleanRut.length() - 1);
		return new Rut(Integer.parseInt(mantisa), cleanRut.charAt(cleanRut.length() - 1));
	}
}
