package Extra;

import java.util.Scanner;

public class Nagusia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programak erabiltzaileari bere izena eta bere adina eskatuko dizkio.
		// i. 18 urte edo gutxiago baditu mezu hau erakutsiko du: EZIN ZARA SISTEMAN
		// SARTU!
		// ii. 18 urte baino gehiago baditu mezu hau erakutsiko du: Kaixo, IZENA
		// MAIUSKULAZ, ongi etorri.
		// Zer egin nahi duzu?
		// 1- Zenbakiak gehitu
		// 2- Hitz bat minuskulara pasatu
		// 3- Lauki baten azalera kalkulatu

		// Bariableak
		String iz;
		int adin, auk;
		Scanner tek = new Scanner(System.in);

		// Izena eta adiña eskatu
		System.out.println("Zein da zure izena?");
		iz = tek.nextLine();
		System.out.println("Zein da zure adiña?");
		adin = Integer.parseInt(tek.nextLine());

		// Adiña egiaztatu
		if (adin <= 18 && adin>0) {
			System.out.println("EZIN ZARA SISTEMAN SARTU!");
		}
		if (adin > 18) {
			System.out.println("Kaixo " + iz.toUpperCase() + ", ongi etorri!!");
			System.out.println("Zer egin nahi duzu?");
			System.out.println("1- Zenbakiak gahitu");
			System.out.println("2- Hitz bat minuskulara pasatu");
			System.out.println("3- Lauki baten azalera kalkulatu");
			auk = Integer.parseInt(tek.nextLine());

			// 1- Zenbakiak gehitu
			if (auk == 1) {
				// Bariableak1
				int zenkop, tot1 = 0;

				// 1 Zenbakiak definitu
				System.out.println("Zure aukera: 1- Zenbakiak gehitu");
				System.out.println("Zenbat zenbaki gehitu nahi dituzu?");
				zenkop = Integer.parseInt(tek.nextLine());

				// 1 Zenbakia egokia den egiaztatu
				if (zenkop > 0) {
					int[] zen = new int[zenkop];

					// 1 Arraia zenbakiekin bete
					System.out.println("Orain gehitu nahi dituzun zenbakiak eman behar dizkidazu.");
					for (int i = 0; i < zenkop; i++) {
						System.out.println("Eman zenbaki bat");
						zen[i] = Integer.parseInt(tek.nextLine());
					}

					// 1 Zenbakiak gehitu
					for (int i = 0; i < zenkop; i++) {
						tot1 = tot1 + zen[i];
					}

					// 1 Erantzuna artera
					System.out.println("Zenbakien gehitura: " + tot1);
					// 1 Zenbaki kopurua 0 edo txikiagoa bada
				} else {
					System.out.println("ERROREA!");
				}

			}
			// 2- Hitz bat minuskulara pasatu
			if (auk == 2) {

				// 2 Bariableak
				String hitz;

				// 2 Hitza eman
				System.out.println("Zure aukera: 2- Hitz bat minuskulara pasatu");
				System.out.println("Eman maiuskulaz hitz bat");
				hitz = tek.nextLine();

				// 2 Erantzuna
				System.out.println(hitz.toLowerCase());
			}

			// 3- Lauki baten azalera kalkulatu
			if (auk == 3) {

				// 3 Bariableak
				int al1, al2, az;

				// 3 Aldeen balioak eman
				System.out.println("Zure aukera: 3- Lauki baten azalera kalkulatu");
				System.out.println("Eman laukiaren alde baten balioa cm-tan");
				al1 = Integer.parseInt(tek.nextLine());
				System.out.println("Eman laukiaren beste aldearen balioa cm-tan");
				al2 = Integer.parseInt(tek.nextLine());
				if (al1 >= 0 && al2 >= 0) {
					// 3 Azalera kalkuklatu
					az = al1 * al2;

					// 3 Erantzuna
					System.out.println("Laukiaren azalera cm karratuetan: " + az);
					// 3 Aldeen balioa 0 edo txikiagoa bada
				} else {
					System.out.println("ERROREA!");
				}
				// Aukeren egiaztaketa
			}
			if (auk < 1 || auk > 3) {
				System.out.println("ERROREA!");
			}
			// Adina 0 edo txikiagoa bada
		} else {
			System.out.println("ERROREA!");
		}
		System.out.println("AMAIERA!");
		tek.close();
	}

}
