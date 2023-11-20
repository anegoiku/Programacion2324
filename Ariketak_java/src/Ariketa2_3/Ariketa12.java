package Ariketa2_3;

import java.util.Scanner;

public class Ariketa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa bat idatzi, zenbaki bat eskatzen duena eta bere biderketa taula ateratzen duena, 1etik 10era.
		
		//Bariableak
		int zen, i;
		Scanner tek=new Scanner (System.in);
		
		//Datuak
		System.out.println("Eman zenbaki bat");
		zen=tek.nextInt();
		tek.close();
		
		
		//Eragiketak eta erantzunak
		for(i=1; i<=10; i++){
			System.out.println(zen+ "x"+ i + "=" + zen*i);
		
		}
		
	}

}
