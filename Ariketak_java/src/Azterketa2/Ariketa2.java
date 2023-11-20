package Azterketa2;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Idatzi programa bat Javan, erabiltzaileari 2 zenbaki eskatzeko eta programak
		// 2 zenbaki horien artean dauden zenbaki guztiak inprimatzeko (erabiltzaileak
		// sartu dituen zenbakiak barne).

		// Bariableak
		int zen1, zen2, i;
		Scanner tek = new Scanner(System.in);

		// Datuak
		System.out.println("Bi zenabkien artean dauden zenbakiak esango dizkizut");
		System.out.println("Eman zenbaki txikia");
		zen1 = tek.nextInt();
		System.out.println("Eman zenbaki handia");
		zen2 = tek.nextInt();
		tek.close();

		// Eragiketa eta erantzuna
		for (i = zen1; i <= zen2; i++) {
			System.out.println(i);
		}
		System.out.println("BUKAERA");
	}

}
