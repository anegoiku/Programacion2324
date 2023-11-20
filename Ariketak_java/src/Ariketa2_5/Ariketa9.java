package Ariketa2_5;

public class Ariketa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bi arrai sortu arrHile eta arrLitr. Lehenengoan urtarrilatik maiatzararteko
		// hilabeteak gorde behar dira. Bigarrenean egindako euri litroak (123,
		// 333,180,211,90).
		// 1. Hilabete bakoitzean egin duen euri litro kopurua bistaratu.
		// 2. Kalkulatu zein izan den hilabeterik euritsuena. Bistaratu hilabetea eta
		// litroak.

		// Bariableak
		String[] hile = { "urtarrila", "otsaila", "martxoa", "apirila", "maiatza" };
		String maxhil = "";
		int[] litr = { 123, 333, 180, 211, 90 };
		int maxlitr = 0;

		// Eragiketa 1
		System.out.println("Hilabete bakoitzeko euri kopuruak hauek dira:");
		for (int i = 0; i < 5; i++) {
			// Erantzuna 1
			System.out.println(hile[i]);
			System.out.println(litr[i]);
		}

		// Eragiketa 2
		for (int i = 0; i < litr.length; i++) {
			if (maxlitr < litr[i]) {
				maxlitr = litr[i];
				maxhil = hile[i];
			}
		}
		// Erantzuna 2
		System.out.println("Hilabeterik euritsuena " + maxhil + " da " + maxlitr + " euri litrorekin.");

	}

}