package cl.duamit.shared.rut;

public class RutMapper {

	public static RutMapper build() {
		return new RutMapper();
	}

	public Rut parse(String rut) {
		String cleanRut = rut.replaceAll("\\.", "").replace("-", "");
		String mantisa = cleanRut.substring(0, cleanRut.length() - 1);
		return new Rut(Integer.parseInt(mantisa), cleanRut.charAt(cleanRut.length() - 1));
	}
}
