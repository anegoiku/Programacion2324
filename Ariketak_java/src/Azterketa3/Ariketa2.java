package Azterketa3;

import java.util.Scanner;

public class Ariketa2 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Idatzi programa bat, teklatutik zenbaki bat eskatzen duena eta tamaina
		// horretako arrai bat betetzea eskatzen duena, izenekin. Gero, erabiltzaileak
		// sartutako izen bat arrai-an dagoen egiaztatu beharko da.

		// Bariableak
		int tam;
		String izbi;
		Scanner tek = new Scanner(System.in);

		// Arraiaren tamaña definitu
		System.out.println("Eman zenbaki bat eta tamaña horretako arrai bat sortuko dut");
		tam = tek.nextInt();
		String[] iz = new String[tam];

		// Arraia izenekin bete
		for (int i = 0; i < iz.length; i++) {
			System.out.println("Eman izen bat:");
			iz[i] = tek.next();
		}

		// Egiaztatu beharreko izena
		System.out.println("Esan izen bat eta arraiaren barruan dagoen edo ez esango dizut:");
		izbi = tek.next();

		// Izena arraiaren barruan dagoen ala ez egiaztatu
		for (int i = 0; i < iz.length; i++) {
			if (iz[i].equalsIgnoreCase(izbi)) {
				// Arraiaren barruan dago
				System.out.println(izbi + " arraiaren barruan dago.");
			}
		}
		for (int i = 0; i < iz.length; i++) {
			if (!(iz[i].equalsIgnoreCase(izbi))) {
				// Arraiaren barruan dago
				System.out.println(izbi + " ez dago arraiaren barruan.");
			}
		}
		System.out.println();
			
			
		System.out.println("AMAIERA");
		
		tek.close();
	}

}
