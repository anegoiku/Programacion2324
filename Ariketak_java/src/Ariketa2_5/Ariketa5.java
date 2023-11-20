package Ariketa2_5;

public class Ariketa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5 luzerako arraia definitu eta izenekin bete. Gero, a-z hasten diren izenak
		// pantailatik atera.

		// Bariableak
		String[] izenak = new String[5];
		izenak[0] = "Ane";
		izenak[1] = "Sofia";
		izenak[2] = "Jon";
		izenak[3] = "Aimar";
		izenak[4] = "Zofia";
		String hitza;
		char lehen;

		// Eragiketak
		for (int i = 0; i < izenak.length; i++) {
			hitza = izenak[i];
			lehen = hitza.charAt(0);
			if (lehen == 'A' || lehen == 'Z') {
				System.out.println(izenak[i]);
			}

		}

	}

}
