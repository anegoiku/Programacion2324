package Ariketa2_3;

import java.util.Scanner;

public class Ariketa19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aldagai bat definitu, 0 eta 100 arteko ausazko balorea hartzen duena. Erabiltzaileak asmatu behar du zenbakia, eta programak erabiltzailearen aukera handiagoa edo txikiagoa den adierazi, asmatu arte. Asmatzen denean zenbat saiakera izan diren esan (Azalpena)  :
		//(int)Math.floor(Math.random() * (max - min + 1) + min)
		//int zenbakia = (int)Math.floor(Math.random()*100+1);

		//Datuak
		int zen, nizen;
		zen = (int)Math.floor(Math.random()*100+1);
		nizen=200;
		Scanner tek=new Scanner(System.in);
		
		//Eragiketak
		while(zen!=nizen) {
			System.out.println("Eman zenbaki bat");
			nizen=tek.nextInt();
			
			if(zen<nizen) {
				System.out.println("Zenbakia txikiagoa da");
			}else {
				System.out.println("Zenbakia handiagoa da");
				
			}
		}
		System.out.println("Zorioonaak!!! Asmatu duzuu!!");
		
		tek.close();
		
		
	}

}
