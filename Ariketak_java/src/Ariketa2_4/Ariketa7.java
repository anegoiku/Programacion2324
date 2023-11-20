package Ariketa2_4;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Web helbide bat hiru lerrotan idatzi

		// Bariableak
		String katea, hitz;
		char kar;
		int i;
		hitz = "";
		Scanner tek = new Scanner(System.in);

		// Eragiketak
		System.out.println("Eman esaldi web horri bat eta hiru lerrotan emango dizut.");
		katea = tek.nextLine();
		tek.close();

		// Eragiketak eta erantzunak
		for (i = 0; i < katea.length(); i++) {
			kar = katea.charAt(i);
			if (kar != '.') {
				hitz = hitz + katea.charAt(i);
			} else {
				System.out.println(hitz);
				hitz = "";
			}
		}
		System.out.println(hitz);

	}

}
