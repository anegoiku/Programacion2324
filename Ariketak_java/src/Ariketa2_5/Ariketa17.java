package Ariketa2_5;

import java.util.Scanner;

public class Ariketa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10eko arraia definitu eta 10 zenbaki eskatu. Arraia txikienetik handienera
		// ordenatuta gelditu behar da.

		// Bariableak
		int[] zen = new int[10];
		Scanner tek = new Scanner(System.in);
		int tenp = 0;

		// Arraia bete
		for (int i = 0; i < zen.length; i++) {
			System.out.println("Eman zenbaki bat");
			zen[i] = tek.nextInt();
		}

		do {
			for (int i = 0; i < zen.length - 1; i++) {
				if (zen[i] > zen[i + 1]) {
					tenp = zen[i + 1];
					zen[i + 1] = zen[i];
					zen[i] = tenp;
				}
			}
		} while (!(zen[0] <= zen[1] && zen[1] <= zen[2] && zen[2] <= zen[3] && zen[3] <= zen[4] && zen[4] <= zen[5]
				&& zen[5] <= zen[6] && zen[6] <= zen[7] && zen[7] <= zen[8] && zen[8] <= zen[9]));

		System.out.println("Hauek dira zenbakiak ordenean:");
		for (int i = 0; i < zen.length; i++) {
			System.out.println(zen[i]);
		}
		tek.close();

	}

}
