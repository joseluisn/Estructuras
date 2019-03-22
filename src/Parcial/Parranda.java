package Parcial;

public class Parranda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int friends = 5;
	}

	int[] a = new int[5];
	int[] snacks = new int[5];

	// Method to calculate between five liquors and snaks values
	public int menorValor(int[] a) {
		int less;
		less = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < less && a[i] != 0) {
				less = a[i];
			}
		}
		return less;
	}

	// Method for calculate the amount to be paid
	public static int valueToPay(int less, int friends) {
		int budget = 0;
		int cantmin = friends * 2;
		int beer = 10;
		budget = less+cantmin+beer;
		return budget;
	}
}
