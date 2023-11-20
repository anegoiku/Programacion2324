package Ariketa2_5;

public class Ariketa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Gelako ikasleen izena eta adina datutzat hartuta, honako informazioa
		// bistaratu nahi da:
		// 1. 20 urte edo gutxiago duten ikasleen kopurua.
		// 2. Gelako batazbesteko adina.
		// 3. Gelako ikaslerik gazteena eta bere izena

		// Bariableak
		String[] ikasle = { "Ane", "Sofia", "Jon", "Aimar", "Paul" };
		int[] adin = { 21, 21, 21, 19, 20 };
		int txikzen, kop, tot;
		String txikiz = "";
		txikzen = 1000000000;
		kop = 0;
		tot = 0;

		// Eragiketak
		for (int i = 0; i < adin.length; i++) {
			if (adin[i] <= 20) {
				kop++;
			}
			if (adin[i] < txikzen) {
				txikzen = adin[i];
				txikiz = ikasle[i];
			}
			tot = tot + adin[i];
		}
		System.out.println("20 urte edo gutxiago duten ikasle kopurua " + kop + " da.");
		System.out.println("Gelako bataz besteko adiña " + tot / 5 + " da.");
		System.out.println("Gelako ikaslerik txikiena " + txikiz + " da eta " + txikzen + " urte ditu.");

	}

}