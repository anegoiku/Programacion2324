package Ariketa2_5;

public class Ariketa18_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitiba. 1etik 49ra arteko ausazko 6 zenbaki bistaratu.

		// Bariableak
		int[] zen = new int[6];
		int tenp = 0;

		// Eragiketak
		do {
			for (int i = 0; i < zen.length; i++) {
				tenp = (int) Math.floor(Math.random() * 49 + 1);

				if (!(zen[0] == tenp || zen[1] == tenp || zen[2] == tenp || zen[3] == tenp || zen[4] == tenp
						|| zen[5] == tenp)) {
					zen[i] = tenp;
				}
			}
		} while (zen[0] == 0 || zen[1] == 0 || zen[2] == 0 || zen[3] == 0 || zen[4] == 0 || zen[5] == 0);

		// Zenbakiak ordenatu
		do {
			for (int i = 0; i < (zen.length - 1); i++) {
				if (zen[i] > zen[(i + 1)]) {
					tenp = zen[i];
					zen[i] = zen[(i + 1)];
					zen[(i + 1)] = tenp;
				}
			}

		} while (!(zen[0] <= zen[1] && zen[1] <= zen[2] && zen[2] <= zen[3] && zen[3] <= zen[4] && zen[4] <= zen[5]));

		// Zenbakiak bistaratu
		System.out.println("Hauek dira zure primitibaren hausazko zenbakiak:");
		for (int i = 0; i < zen.length; i++) {
			System.out.println(zen[i]);
		}

	}

}
