package Ariketa2_5;

public class Ariketa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sarrera datu bezala asteko egun guztietako tenperatura daukagu, gradu
		// Cº-etan. Honako emaitza nahi dugu:
		// Asteko batazbesteko tenperatura F graduetan.
		// Egunik beroena.
		// Batazbestekotik gora dauden egunak.

		// Bariableak
		String[] egun = { "astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata", "igandea" };
		double[] graduC = { 15, 14, 17, 15, 15, 17, 20 };
		double graduF;
		double sumaF = 0;
		double sumaC = 0;
		double batazC = 0;
		int beroT = 0;

		// Eragiketak
		for (int i = 0; i < graduC.length; i++) {
			graduF = graduC[i] * 1.8 + 32;
			sumaF = sumaF + graduF;

			if (graduC[i] > graduC[beroT]) {
				beroT = i;
			}

			sumaC = sumaC + graduC[i];

		}
		System.out.println("Asteko batazbesteko temperatura F graduetan: " + sumaF / graduC.length);
		System.out.println("Asteko egunik beroena: " + egun[beroT]);
		System.out.println("Batazbestekotik gora dauden egunak: ");
		batazC = sumaC / graduC.length;
		for (int i = 0; i < graduC.length; i++) {
			if (graduC[i] > batazC) {
				System.out.println(egun[i]);
			}
		}

	}

}
