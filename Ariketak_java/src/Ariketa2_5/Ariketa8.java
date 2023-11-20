package Ariketa2_5;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10 luzerako arraia teklatutik sartutako zenbakiekin bete. Gero honako menua
		// atera, dagozkion aukerak garatuz:
		// 1. Batuketa kalkulatu eta bistaratu.
		// 2. Zenbakirik altuena bistaratu.
		// 3. Zenbakirik txikiena bistaratu.
		// 4. Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.

		// Bariableak
		int bat, auk, han, txi, igu, kont;
		bat = 0;
		han = 0;
		txi = 1000000000;
		kont = 0;
		int[] zen = new int[10];
		Scanner tek = new Scanner(System.in);

		// Zenbakiekin bete
		for (int i = 0; i < 10; i++) {
			System.out.println("Eman zenbaki bat");
			zen[i] = tek.nextInt();
		}
		// Menua
		System.out.println("Aukeratu zenbaki bat:");
		System.out.println("1. Batuketa kalkulatu eta bistaratu.");
		System.out.println("2. Zenbakirik altuena bistaratu.");
		System.out.println("3. Zenbakirik txikiena bistaratu.");
		System.out.println("4. Zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratu.");
		auk = tek.nextInt();
		// Eragiketak
		if (auk == 1) {
			System.out.println("Zure aukera batuketa kalkulatzea eta bistaratzea da.");
			for (int i = 0; i < 10; i++) {
				bat = bat + zen[i];
			}
			System.out.println("Zenbakien batuketa " + bat + " da.");
		}
		if (auk == 2) {
			System.out.println("Zure aukera zenbakirik altuena bistaratzea da.");
			for (int i = 0; i < 10; i++) {
				if (zen[i] > han) {
					han = zen[i];
				}
			}
			System.out.println("Zenbakirik altuena " + han + " da.");
		}
		if (auk == 3) {
			System.out.println("Zure aukera zenabkirik txikiena bistaratzea da.");
			for (int i = 0; i < 10; i++) {
				if (zen[i] < txi) {
					txi = zen[i];
				}
			}
			System.out.println("Zenbakirik txikiena " + txi + " da.");
		}
		if (auk == 4) {
			System.out.println("Zure aukera zenbaki bat eskatu eta arraian zenbat bider agertzen den bistaratzea da.");
			System.out.println("Eman zenbaki bat");
			igu = tek.nextInt();

			for (int i = 0; i < 10; i++) {
				if (zen[i] == igu) {
					kont++;
				}
			}
			System.out.println(igu + " zenbakia " + kont + " aldiz agertzen da.");
		}
		if (auk < 1 || auk > 4) {
			System.out.println("ERROREA");
		}

		tek.close();

	}

}