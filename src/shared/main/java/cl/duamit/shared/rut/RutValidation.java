package cl.duamit.shared.rut;

public class RutValidation {

	public static RutValidation build() {
		return new RutValidation();
	}

	public static Boolean validate(Rut rut) {
		return rut.getDv() == calculateDV(rut.getMantisa());
	}

	public static char calculateDV(Integer rut) {
		Integer M = 0, S = 1;
		for (; rut != 0; rut = (int) Math.floor(rut /= 10))
			S = (S + rut % 10 * (9 - M++ % 6)) % 11;
		return (S > 0) ? String.valueOf(S - 1).charAt(0) : 'k';
	}
}
