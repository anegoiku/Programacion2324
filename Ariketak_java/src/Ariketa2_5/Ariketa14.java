package Ariketa2_5;

import java.util.Scanner;

public class Ariketa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa batean 10 luzerako arraia sortu behar da, teklatutik irakurritako
		// zenbakiekin bete behar da. Kalkulatu behar da zenbat zenbaki diren
		// positiboak, zenbat negatiboak eta zenbat 0.

		// Bariableak
		int[] zen = new int[10];
		int kopplus = 0, kopminus = 0, kopzero = 0;
		Scanner tek = new Scanner(System.in);

		// Arraia bete
		for (int i = 0; i < zen.length; i++) {
			System.out.println("Eman zenbaki bat:");
			zen[i] = tek.nextInt();
		}
		// Positibo, negatibo eta zero kopurua´
		for (int i = 0; i < zen.length; i++) {
			if (zen[i] > 0) {
				kopplus++;
			}
			if (zen[i] < 0) {
				kopminus++;
			}
			if (zen[i] == 0) {
				kopzero++;
			}
		}
		System.out.println("Zenbaki positibo kopurua: " + kopplus);
		System.out.println("Zenbaki negatibo kopurua: " + kopminus);
		System.out.println("Zero kopurua: " + kopzero);
		tek.close();
	}

}
