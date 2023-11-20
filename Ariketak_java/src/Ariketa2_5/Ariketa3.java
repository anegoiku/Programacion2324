package Ariketa2_5;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// n zenbaki bat irakurri eta arrai bat definitu, n luzerakoa eta 1etik 10era
		// dauden ausaz sortutako zenbakiekin bete.

		// Bariableak
		int n;
		Scanner tek = new Scanner(System.in);
		System.out.println("Esan zenbat zenbaki nahi dituzun");
		n = tek.nextInt();

		int[] zen = new int[n];

		// Eragiketak
		for (int i = 0; i < n; i++) {
			zen[i] = (int) Math.floor(Math.random() * 10 + 1);
			System.out.println(zen[i]);
		}
		tek.close();
	}

}
