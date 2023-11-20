package Ariketa2_5;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 luzerako arraia definitu eta izenez bete. Erabiltzaileari izen bat eskatu
		// eta arraian dagoen edo ez adierazi.

		// Bariableak
		String[] izenak = new String[5];
		izenak[0] = "Ane";
		izenak[1] = "Sofia";
		izenak[2] = "Jon";
		izenak[3] = "Aimar";
		izenak[4] = "Zofia";
		String iz;
		String igual;
		igual = "";

		Scanner tek = new Scanner(System.in);

		// Eragiketak
		System.out.println("Eman izenbat eta zerrendan dagoen edo ez esango dizut");
		iz = tek.nextLine();
		tek.close();
		for (int i = 0; i < izenak.length; i++) {
			if (iz.equalsIgnoreCase(izenak[i])) {
				System.out.println(izenak[i] + " zerrendan dago");
				iz = igual;
			}

		}
		if (!iz.equalsIgnoreCase(igual)) {
			System.out.println(iz + " ez dago zerrendan");
		}

	}

}
