package Parcial;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class parcial {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x = 5;
		int y = 9;
		int z = 8; 
		
		
		rutasMañana(conductores(x), x);
		rutasTarde(conductores(x), y);
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		bw.write("Las horas extras trabajadas son:  "+ horasExtras(4,z));
	}

	// Method to calculate the value of overtime worked
	public static int horasExtras(int p, int horas) {
		int horaExt = 0;
		int horasDia = 8;
		horaExt = horasDia - horas;
		horaExt = 2 * p * horaExt;
		return horaExt;
	}

	// Method to store the number of drivers
	public static int[] conductores(int x) {
		int[] conductores = new int[x];
		for (int i = 0; i < conductores.length; i++) {
			conductores[i] = x;
			conductores[i]++;
		}

		return conductores;
	}

	// Method to assign drivers to the morning routes
	public static int[] rutasMañana(int[] con, int x) {
		int[] rutasMañana = new int[x];
		for (int i = 0; i < rutasMañana.length; i++) {
			rutasMañana[i] = con[i];
			rutasMañana[i]++;
		}

		return rutasMañana;
	}

	// Method to assign drivers to the afternoon routes
	public static int[] rutasTarde(int[] con, int x) {
		int[] rutasTarde = new int[x];
		for (int i = 0; i < rutasTarde.length; i++) {
			if (conductorAsignado(rutasTarde,x) == false)
				rutasTarde[i] = con[i];
			    rutasTarde[i]++;
		}

		return rutasTarde;
	}

	// Method to search if the driver was already assigned with route in a turn
	public static boolean conductorAsignado(int[] rutas, int num) {
		int cond=num;
		boolean res = false;
		for (int i = 0; i <= rutas.length; i++) {
			if (rutas[i] == cond)
				res = true;
		}
		return res;

	}

}
