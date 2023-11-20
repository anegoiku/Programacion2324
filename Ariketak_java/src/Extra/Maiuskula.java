package Extra;

import java.util.Scanner;

public class Maiuskula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programak erabiltzaileari bere izena eskatuko dio. Gero, pantailatik
		// maiuskulaz erakutsiko du.
		
		//Bariableak
		String izena;
		Scanner tek=new Scanner(System.in);
		
		//Datuak
		System.out.println("Zein da zure izena??");
		izena=tek.nextLine();
		tek.close();
		
		//Erantzuna
		System.out.println("Zure izena " + izena.toUpperCase() + " da.");
		
	}

}
