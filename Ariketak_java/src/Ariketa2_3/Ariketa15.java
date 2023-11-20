package Ariketa2_3;

import java.util.Scanner;

public class Ariketa15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa bat idatzi, erabiltzaileak zehaztutako baloaren biderkatzaileak ateratzen dituena 0 eta 100 artean.
		
		//Bariableak
		int zen, i;
		Scanner tek=new Scanner (System.in);
		
		//Datuak
		System.out.println("Eman zenbaki bat");
		zen=tek.nextInt();
		tek.close();
		
		
		//Eragiketak eta erantzunak
		for(i=0; i<=100; i++){
			if(i%zen==0) {
				System.out.println(i);
			}
		
		}
	}

}
