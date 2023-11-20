package Ariketa2_6;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Metodoa sortu, double bat eurotan jasotzen duena eta dolaretan itzultzen
		// duena.

		// Bariableak
		double euro, dolar;
		Scanner tek = new Scanner(System.in);

		// Euroak definitu
		System.out.println("Esan zenbat euro dituzun eta dolaretara pasatuko dizkizut");
		euro = tek.nextDouble();

		// Dolaretara pasatu
		dolar = EurotikDolaretara(euro);
		
		System.out.printf("Emandako euroak dolaretan: " + "%.2f\n", dolar);

		tek.close();
	}

	public static double EurotikDolaretara(double euro) {
		double aldaketa = euro * 1.07;
		return aldaketa;
	}

}
