package Azterketa1;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Java-ko programa bat idatzi ikasle bat beka bat jasotzeko hautagai den
		// zehazteko. Bi irizpide eduki behar dira kontutan.:
		// Ikaslearen noten batazbestekoa 3,5-ekoa izan behar da, 4-ko eskala batean.
		// Seihilabeteko hutsegiteen kopurua 3 izango da gehienez.

		// Bariableak
		double bataz;
		int huts;
		Scanner scan = new Scanner(System.in);

		// Datuak
		System.out.println("Noten batazbestekoa sartu:");
		bataz = scan.nextDouble();

		// Eragiketaak eta erantzunak
		if (bataz >= 3.5 && bataz <= 4) {
			System.out.println("Hutsegite kopurua satu:");
			huts = scan.nextInt();
			scan.close();
			if (huts >= 0 && huts <= 3) {
				System.out.println("Zorionaak, beka zurea da!!");
				System.out.println("Programa bukaera");
			} else {
				if (huts < 0) {
					System.out.println("ERROREA, zenbakia 0 baino handiagoa izan behar da");
					System.out.println("Programa bukaera");
				} else {
					if (huts > 3) {
						System.out.println("Falta gehiegi dituuzu, ez dagokio bekarik");
						System.out.println("Programa bukaera");
					}
				}
			}

		} else {
			if (bataz < 0 && bataz > 4) {
				System.out.println("ERROREA, zenbakia 0 eta 4 artean egon behar da");
				System.out.println("Programa bukaera");

			} else {
				if (bataz < 3.5) {
					System.out.println("Batazbestekoa gutxienez 3.5-koa izan behar da, ze dagokio bekarik");
					System.out.println("Programa bukaera");
				}
			}
		}

	}

}
