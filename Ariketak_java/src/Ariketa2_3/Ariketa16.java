package Ariketa2_3;

import java.util.Scanner;

public class Ariketa16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 zenbaki eskatu eta pantailatik handiena atera.
		
		//Datuak
		int zen, i, han;
		han=0;
		i=0;
		Scanner tek=new Scanner (System.in);
		
		//Eragiketak
		for (i=0 ; i<=10 ; i++) {
			System.out.println("Eman zenbaki bat");
			zen=tek.nextInt();
			
			if(zen>han) {
			han=zen;
			}
		}
		System.out.println("Zenbakirik handiena " + han + " da.");
		tek.close();
	}

}
