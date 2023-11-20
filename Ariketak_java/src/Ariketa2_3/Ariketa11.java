package Ariketa2_3;

import java.util.Scanner;

public class Ariketa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa bat idatzi, zenbaki bat eskatzen duena eta pantailatik zenbakiaren
		// kopuru bereko asteriskoak ateratzen dituena, lerro berean.

		// Bariableak
		int zen;
		Scanner tek = new Scanner(System.in);

		// Datuak
		System.out.println("Eman zenbaki bat");
		zen = tek.nextInt();
		tek.close();

		// Eragiketaak etaa erantzuna
		while (zen != 0) {
			System.out.print("*");
			zen--;
		}

	}

}
