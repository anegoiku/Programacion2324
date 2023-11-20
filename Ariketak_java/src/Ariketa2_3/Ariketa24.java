package Ariketa2_3;

import java.util.Scanner;

public class Ariketa24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Algoritmo bat idatzi, sartzen den zenbakia lehena (primo) den edo ez esaten duena.
		
		//Bariableak
		int i, zen;
		boolean lehen;
		lehen=true;
		Scanner tek=new Scanner (System.in);
		
		//Datuak
		System.out.println("Eman zenbaki bat eta esango dizut lehena den edo ez.");
		zen=tek.nextInt();
		
		//Eragiketak eta erantzuna
		for(i=2 ; i<zen ; i++) {
			if((zen%1)==0)
				lehen=false;
		}
		if(lehen==false) 
			System.out.println(zen + " ez da lehena.");
		else if (lehen=true)
		System.out.println(zen + "lehena da.");
		tek.close();
		
	}

}
