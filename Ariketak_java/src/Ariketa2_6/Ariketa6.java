package Ariketa2_6;

import java.util.Scanner;

public class Ariketa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lehenaDa izeneko funtzioa sortu, int bat jasotzen du eta boolean bat
		// itzultzen du.

		// Bariableak
		int zen;
		boolean lehen;
		Scanner tek = new Scanner(System.in);

		// Datuak jaso
		System.out.println("Eman zenbaki bat eta lehena den edo ez esango dizut");
		zen = tek.nextInt();

		lehen = lehenaDa(zen);
		if (lehen == false) {
			System.out.println("Zenbakia ez da lehena");
		} else if (lehen == true) {
			System.out.println("Zenbakia lehena da");
		}
		tek.close();
	}

	private static boolean lehenaDa(int zen) {
		boolean lehen = true;
		for (int i = 2; i < zen; i++) {
			if ((zen % i) == 0) {
				lehen = false;
			}
		}
		return lehen;
	}

}
