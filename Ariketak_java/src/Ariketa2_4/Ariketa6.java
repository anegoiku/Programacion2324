package Ariketa2_4;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Esaldi baten bokal kopuru eta kontsonante kopurua zenbatu. Zuriuneek ez dute
		// kontatzen.

		// Bariableak
		String katea;
		int bok, kons;
		char letra;
		bok = 0;
		kons = 0;
		Scanner tek = new Scanner(System.in);

		// Datuak
		System.out.println("Eman esaldi bat eta bokal eta kontsonante kopurua esango dizut.");
		katea = tek.nextLine();
		katea.toLowerCase();

		// Eragiketak
		for (int i = 0; i < katea.length(); i++) {
			letra = katea.charAt(i);
			if (Character.isLetter(letra)) {
				if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
					bok++;
				} else {
					kons++;
				}
			}
		}
		System.out.println("Bokal kopurua= " + bok);
		System.out.println("Kontsonante kopurua= " + kons);

		tek.close();
	}

}
