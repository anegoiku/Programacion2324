package Ariketa2_5;

import java.util.Scanner;

public class Ariketa16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 20 langileren izena eta soldata irakurtzen duen arraia sortu eta soldatarik
		// handiena duen langilearen izena eta soldata bistaratu.(arrai bat beharko da
		// izenentzako eta beste bat soldatentzako)

		// Bariableak
		String[] iz = new String[20];
		int[] sol = new int[20];
		int han = 0;
		Scanner tek = new Scanner(System.in);

		// Izenak eta soldatak definitu
		for (int i = 0; i < iz.length; i++) {
			System.out.println("Zein da langilearen izena?");
			iz[i] = tek.nextLine();
			System.out.println("Zenabtekoa da bere soldata?");
			sol[i] = tek.nextInt();
		}
		// Soldata handiena
		for (int i = 0; i < iz.length; i++) {
			if (sol[i] > han) {
				han = sol[i];
			}
		}
		// Emaitza bistaratu
		for (int i = 0; i < iz.length; i++) {
			if (sol[i] == han) {
				System.out.println(
						"Soldata handiena duen langilea " + iz[i] + "da eta hau da bere soldata eurotan: " + sol[i]);
			}
		}
		tek.close();

	}

}
