package Ariketa2_4;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teklatutik esaldi bat sartu adb.: "Ondo etorri Zornotzara”, gero, ordeztu
		// nahi den hitza idatzi (adb.: Zornotza) eta gero zerekin ordeztuko den (adb.:
		// Amorebieta). Pantailatik atera esaldi berria.

		// Bariableak
		String katea, bat, bi;
		Scanner tek = new Scanner(System.in);

		// Datuak
		System.out.println("Eman esaldi bat eta hitz bat ordezkatuko dizut");
		katea = tek.nextLine();
		System.out.println("Esan zein den ordezkatu nahi duzun hitza");
		bat = tek.nextLine();
		System.out.println("Zer hitzgatik ordezkatu nahi duzu?");
		bi = tek.nextLine();
		tek.close();

		// Eragiketa
		System.out.println(katea.replace(bat, bi));

	}

}
