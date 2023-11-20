package Ariketa2_5;

import java.util.Scanner;

public class Ariketa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 20 langileren izena eta soldata irakurtzen duen arraia sortu eta soldatarik
		// handiena duen langilearen izena eta soldata bistaratu.(arrai bat beharko da
		// izenentzako eta beste bat soldatentzako)

		// Bariableak
		String[] lan = new String[20];
		int[] sol = new int[20];
		int han = 0;
		Scanner tek = new Scanner(System.in);

		// Izenak eta soldatak
		for (int i = 0; i < lan.length; i++) {
			System.out.println("Eman langilearen izena");
			lan[i] = tek.next();
			System.out.println("Eman langileaten soldata");
			sol[i] = tek.nextInt();
		}

		// Soldatarik handiena
		for (int i = 0; i < lan.length; i++) {
			if (sol[i] > han) {
				han = sol[i];
			}
		}
		System.out.println("Soldatarik handiena duen edo duten langileak hauek dira:");
		for (int i = 0; i < lan.length; i++) {
			if (sol[i] == han) {
				System.out.println(lan[i] + ": " + sol[i] + " euro");
			}
		}
		tek.close();

	}

}
