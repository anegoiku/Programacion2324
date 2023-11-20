package Azterketa2;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Idatzi programa bat Javan, erabiltzaileari zenbaki osoak eskatzeko, sartutako
		// zenbakia 0 izan arte. Programa amaitzen denean, esan behar da erabiltzaileak
		// zenbat zenbaki bikoiti eta bakoiti sartu dituen, sartutako zenbaki guztien
		// batura zein den eta zenbat zenbaki sartu diren (0a ez da kontuan hartzen).

		// Bariableak
		int zen, bak, bik, kop, bat;
		bik = 0;
		bak = 0;
		kop = 0;
		bat = 0;
		Scanner tek = new Scanner(System.in);

		System.out.println("Eman zenbaki bat");
		zen = tek.nextInt();

		// Eragiketak
		while (zen != 0) {
			if (zen % 2 == 0) {
				bik = bik + 1;
			} else {
				bak = bak + 1;
			}
			kop = kop + 1;
			bat = bat + zen;
			System.out.println("Eman zenbaki bat");
			zen = tek.nextInt();
		}
		tek.close();

		// Erantzuna
		System.out.println("Zenbaki bikoitiak " + bik + " dira");
		System.out.println("Zenbaki bakoitiak " + bak + " dira");
		System.out.println("Sartutako zenbaki kopurua " + kop + " da");
		System.out.println("Zenbaki guztien batura " + bat + " da");
		
		System.out.println("BUKAERA");
	}

}
