package Ariketa2_5;

public class Ariketa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitiba. 1etik 49ra arteko ausazko 6 zenbaki bistaratu.

		// Bariableak
		int[] zenb = new int[6];
		int tenp = 0;

		// Zenbakiak atera
		do {
			for (int i = 0; i < zenb.length; i++) {
				tenp = (int) Math.floor(Math.random() * 49 + 1);

				// Errepikatuta dauden edo ez egiaztatu
				if (!(zenb[0] == tenp || zenb[1] == tenp || zenb[2] == tenp || zenb[3] == tenp || zenb[4] == tenp
						|| zenb[5] == tenp)) {
					zenb[i] = tenp;
				}
			}
		} while (zenb[0] == 0 || zenb[1] == 0 || zenb[2] == 0 || zenb[3] == 0 || zenb[4] == 0 || zenb[5] == 0);

		// Ordenatu
		do {
			for (int i = 0; i < (zenb.length - 1); i++) {
				if (zenb[i] > zenb[(i + 1)]) {
					tenp = zenb[i];
					zenb[i] = zenb[(i + 1)];
					zenb[(i + 1)] = tenp;
				}
			}
		} while (!(zenb[0] <= zenb[1] && zenb[1] <= zenb[2] && zenb[2] <= zenb[3] && zenb[3] <= zenb[4]
				&& zenb[4] <= zenb[5]));

		// Bistaratu
		System.out.println("Primitibako zenbaki saritua:");
		for (int i = 0; i < zenb.length; i++) {
			System.out.println(zenb[i]);
		}

	}

}
