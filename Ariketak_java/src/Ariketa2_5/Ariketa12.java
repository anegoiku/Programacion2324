package Ariketa2_5;

import java.util.Scanner;

public class Ariketa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10eko arraia bete. Katea eskatu eta kate hori zenbat hitzetan agertzen den
		// (bilaketa bat egin).

		// Bariableak
		String[] hitz = { "", "", "", "", "", "", "", "", "", "" };
		String katea;
		Scanner tek = new Scanner(System.in);
		int kont = 0;

		// Eragiketak
		for (int i = 0; i < hitz.length; i++) {
			System.out.println("Eman hitz bat.");
			hitz[i] = tek.nextLine();
		}
		System.out.println("Eman kate bat eta kate hori zenbat hitzetan agertzen den esango dizut.");
		katea = tek.nextLine();

		for (int i = 0; i < hitz.length; i++) {
			if (hitz[i].contains(katea)) {
				kont++;
			}
		}
		System.out.println(katea + " " + kont + " aldiz agertzen da.");
		tek.close();
	}

}
