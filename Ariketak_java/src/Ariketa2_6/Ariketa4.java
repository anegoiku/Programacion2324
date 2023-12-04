package Ariketa2_6;

import java.util.Scanner;

public class Ariketa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// zirkuloAreaKalkulatu izeneko metodoa sortu. diametroa (int) izeneko
		// parametroa jasoko du eta area (double) itzuliko du.

		// Bariableak
		int dia;
		double emaitza;
		Scanner tek = new Scanner(System.in);

		// Datuak eskatu
		System.out.println("Zenbat cm-koa da borobila?");
		dia = tek.nextInt();

		emaitza = zirkuloAreaKalkulatu(dia);
		System.out.println("Borobilaren azalera: " + emaitza);
		tek.close();
	}

	private static double zirkuloAreaKalkulatu(int dia) {
		double area;
		double radio = dia / 2;
		area = 3.14 * radio * radio;
		return area;

	}

}
