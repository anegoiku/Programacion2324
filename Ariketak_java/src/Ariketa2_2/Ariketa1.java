package Ariketa2_2;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat irakurri eta gainditua edo ez-gainditua den zehaztu.
		
		int zen;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman batetik hamarrera zenbaki bat");
		zen = scan.nextInt();
		scan.close();
		if (zen>=5) {
			System.out.println("Zorionak, gainditu duzu");
		} else {
			System.out.println("Ez duzu gainditiu");
		}
	}

}
