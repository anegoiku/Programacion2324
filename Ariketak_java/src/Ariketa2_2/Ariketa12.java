package Ariketa2_2;

import java.util.Scanner;

public class Ariketa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Kotxearen potentzia kalkulatu, KWtan ematen bada, CVak atera eta CVetan bada, kWak atera (1kW = 1,35 CV). K edo C baloreak eskatu, jakiteko sartutako balorea kWetan den edo CVetan.
		
		double zen;
		String tipo;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Esan zenbakia Kw-tan edo CV-tan den");
		tipo=scan.nextLine();
		System.out.println("Eman zenbaki bat");
		zen=scan.nextDouble();
		
		if(tipo.equals("Kw")) {
			System.out.println(zen*1.35 + "CV");
		}else {
			if(tipo.equals("CV")) {
				System.out.println(zen/1.35 + "Kw");
			}else {
				System.out.println("ERROR");
			}
		}
		scan.close();
		
	}

}
