package Ariketa2_2;

import java.util.Scanner;

public class Ariketa12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kotxearen potentzia kalkulatu, KWtan ematen bada, CVak atera eta CVetan bada, kWak atera (1kW = 1,35 CV). K edo C baloreak eskatu, jakiteko sartutako balorea kWetan den edo CVetan.
		
		//Bariableak
		double zen;
		String tipo;
		Scanner scan=new Scanner(System.in);
		
		//Datuak eskatu
		System.out.println("Zer unitatetan dago potentzia?");
		tipo=scan.nextLine();
		System.out.println("Eman potentziaren zenbakia eta Kw-tik CV-ra edo alderantziz pasatuko dizut");
		zen=scan.nextDouble();
		scan.close();
		
		//Eragiketak eta erantzuna
		if(tipo.equals("Kw")) {
			System.out.println(zen + " Kw, " + zen*1.35 + " CV dira");
		}else {
			if(tipo.equals("CV")) {
				System.out.println(zen + " CV, " + zen/1.35 + " Kw dira");
			} else {
				System.out.println("ERROREA");
			}
		}
		
		
		
		
		
		
	}

}
