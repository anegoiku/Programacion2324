package Ariketa2_5;

import java.util.Scanner;

public class Ariketa2eta4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 luzerako arraia definitu, eta teklatutik sartutako hitzekin bete.
		// 2 ariketari, gehitu izenak pantailatik ateratzea.

		// Bariableak
		String[] hitz = new String[5];
		Scanner tek = new Scanner(System.in);

		// Eragiketa eta erantzuna
		for (int i = 0; i < 5; i++) {
			System.out.println("Eman hitz bat");
			hitz[i] = tek.nextLine();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println(hitz[i]);
		}
		tek.close();

	}

}
