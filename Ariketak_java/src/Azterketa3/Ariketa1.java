package Azterketa3;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Idatzi programa bat, teklatutik zenbaki bat eskatzen duena eta tamaina
		// horretako arrai bat betetzea eskatzen duena, zenbakiekin. Arrai-a, balorerik
		// altuena, balorerik baxuena eta batazbestekoa erakutsiko ditu. Zenbakiak osoak
		// edo hamartarrekin izango dira.

		// Bariableak
		int tam;
		double alt = 0, bax = 1000000000, gehi = 0;
		Scanner tek = new Scanner(System.in);

		// Arraiaren tamaña definitu
		System.out.println("Eman zenbaki bat eta tamaña horretako arrai bat sortuko dut");
		tam = tek.nextInt();
		double[] zen = new double[tam];

		// Arraia zenbakiekin bete
		for (int i = 0; i < zen.length; i++) {
			System.out.println("Eman zenbaki bat:");
			zen[i] = tek.nextDouble();
		}

		// Balorerik altuena, baxuena eta gehiketa
		for (int i = 0; i < zen.length; i++) {
			//Altuena
			if (zen[i] > alt) {
				alt = zen[i];
			}
			//Baxuena
			if (zen[i] < bax) {
				bax = zen[i];
			}
			//Gehiketa batazbestekoa ateratzeko
			gehi = gehi + zen[i];
		}

		// Erantzunak
		System.out.println("Zenbakirik altuena: " + alt);
		System.out.println("Zenbakirik baxuena: " + bax);
		System.out.printf("Zenbaki guztien batazbestekoa: " + "%.2f\n", gehi / tam);
		
		System.out.println("AMAIERA");

		tek.close();
	}

}
