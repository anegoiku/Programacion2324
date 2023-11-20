package Ariketa2_5;

import java.util.Scanner;

public class Ariketa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 luzerako arraia bete behar da zenbaki osoekin. Zenbaki positiboen
		// batazbesteko eta zenbaki nebatiboen batazbestekoa kalkulatu behar da.

		// Bariableak
		int[] zen = new int[10];
		int plus = 0, minus = 0;
		int kopplus = 0, kopminus = 0;
		Scanner tek = new Scanner(System.in);

		// Arraia bete
		for (int i = 0; i < zen.length; i++) {
			System.out.println("Eman zenbaki bat:");
			zen[i] = tek.nextInt();
		}
		// Positibo eta negatiboen batuketa eta kopurua´
		for (int i = 0; i < zen.length; i++) {
			if (zen[i] > 0) {
				plus = plus + zen[i];
				kopplus++;
			}
			if (zen[i] < 0) {
				minus = minus + zen[i];
				kopminus++;
			}
		}
		System.out.println("Zenbaki positiboen batazbestekoa: " + plus / kopplus);
		System.out.println("Zenbaki negatiboen batazbestekoa: " + minus / kopminus);
		tek.close();

	}

}
