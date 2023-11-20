package Ariketa2_5;

import java.util.Scanner;

public class Ariketa13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Gela bateko ikasleen notak teklatutik irakurtzen dituen arraia sortu. Gelako
		// ikasleen batazbesteko nota kalkula behar da. Horrez gain, batazbestetik gora
		// dauden ikasleen notak era erakutsi behar dira. Ikasle kopurua teklatutik
		// irakurtzen da. (arraia hiru bider irakurri behar da, notak esleitzeko,
		// batuketa eta batazbestekoa egiteko eta batazbestekotik gora dauden ikasleak
		// erakusteko).

		// Bariableak
		int ikaskop;
		double sumanota = 0;
		double bataznota;
		Scanner tek = new Scanner(System.in);

		// Eragiketak
		System.out.println("Zein da ikasle kopurua?");
		ikaskop = tek.nextInt();
		String[] ikasle = new String[ikaskop];
		double[] nota = new double[ikaskop];

		for (int i = 0; i < ikaskop; i++) {
			System.out.println("Sartu ikaslearen izena:");
			ikasle[i] = tek.next();
			System.out.println("Sartu ikaslearen nota:");
			nota[i] = tek.nextInt();
			sumanota = sumanota + nota[i];
		}
		bataznota = sumanota / ikaskop;
		System.out.println("Ikasleen noten bataz bestekoa: " + bataznota);
		System.out.println("Noten batazbestekotik gora atara duten ikasleak hauek dira:");
		for (int i = 0; i < ikaskop; i++) {
			if (nota[i] > bataznota) {
				System.out.println(ikasle[i] + ": " + nota[i]);
			}
		}
		tek.close();
	}

}
