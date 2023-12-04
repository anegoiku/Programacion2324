package Ariketa2_6;

import java.util.Scanner;

public class Ariketa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zenbaki hamartarra bitar bihurtzen duen aplikazioa sortu. Metodo bat
		// erabiliko dugu, zenbakia parametro moduan pasatuko zaio eta String-a itzuliko
		// du, zenbakia kode bitarrean adieraziko duena. Zenbaki bat bitarrera
		// pasatzeko, zenbakia zati bi egin beharko da, horren emaitza zati bi, eta
		// horrela gehiago zatitu ezin den arte. Zatiketa bakoitzaren hondarrak kode
		// bitarra osatuko du, behetik gora. Beheko irudian 8 zenbakia kode bitar
		// bihurtzen da 1000:
		
		//Bariableak
		int zen;
		String bitar;
		Scanner tek=new Scanner(System.in);
		
		//Datuak jaso
		System.out.println("Eman zenbaki bat");
		zen= tek.nextInt();
		
		bitar=hamarToBit(zen);
		tek.close();
		System.out.println("Zenbaki bitarra: " + bitar);
		
	}

	private static String hamarToBit(int zen) {
		
		String binario="";
		
		if(zen==0) {
			return "0";
		}
		while(zen>0) {
			int resto = zen%2;
			binario= resto+binario;
			zen/=2;
		}
		return binario;
		
		
	}

}
