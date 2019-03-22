package Parcial;

public class Mochilero {

	int[] hospedaje = new int[10];
	String[] ciudades = { "Medellin", "Cali", "Bucaramanga", "Barranquilla" };

	public static void main(String[] args) {
	

	}

	// Method to know if the person is vaccinated
	public static boolean estaVacunado(int x) {
		boolean res = true;

		if (x == 0) {
			res = false;
		} else {
			res = true;
		}
		return res;

	}

	// Method to calculate between ten hotel values
	public int menorValor() {
		int menortarifa;
		menortarifa = hospedaje[0];
		for (int i = 1; i < hospedaje.length; i++) {
			if (hospedaje[i] < menortarifa && hospedaje[i] != 0 || menortarifa == 0) {
				menortarifa = hospedaje[i];
			}
		}

		return menortarifa;
	}

	// Method to calculate value of travel
	public static int valueToTravel(int tarifa, boolean vac) {
		int presupuesto = 0;
		presupuesto = tarifa;
		if (vac == true) {
			presupuesto += 25000;
		}
		return presupuesto;
	}

}
