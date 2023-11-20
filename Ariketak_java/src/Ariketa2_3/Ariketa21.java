package Ariketa2_3;

import java.util.Scanner;

public class Ariketa21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileak sartzen duen zenbakiaren faktoriala atera.
		
		//Bariableak
		int zen, fak;
		fak=1;
		Scanner tek=new Scanner (System.in);
		
		//Datuak
		System.out.println("Eman zenbaki bat eta bere faktoriala emango dizut");
		zen=tek.nextInt();
		tek.close();
		
		//Eragiketaak eta erantzuna
		while(zen!=0) {
			fak=fak*zen;
			zen--;
		}	
		System.out.println(fak);
	}

}
