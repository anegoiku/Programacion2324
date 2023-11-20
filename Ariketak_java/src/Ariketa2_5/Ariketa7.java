package Ariketa2_5;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n zenbakia irakurri eta luzera horretako arraia definitu. 1etik 10erako
		// ausazko zenbakiekin bete eta gero altuena kalkulatu.

		// Bariableak
		int n, han;
		han = 0;
		Scanner tek = new Scanner(System.in);
		System.out.println("Esan zenbat zenbaki nahi dituzun");
		n = tek.nextInt();

		int[] zen = new int[n];

		// Eragiketak
		for (int i = 0; i < n; i++) {
			zen[i] = (int) Math.floor(Math.random() * 10 + 1);
			if (zen[i] > han) {
				han = zen[i];
			}
		}
		System.out.println("Zenbakirik handiena" + han + "da.");
		tek.close();

	}

}
