package Ariketa2_3;

import java.util.Scanner;

public class Ariketa17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 zenbaki eskatu eta pantailatik handiena eta txikiena atera.

		//Datuak
		int zen, i, han, txi;
		han=0;
		txi=100000000;
		i=0;
		Scanner tek=new Scanner (System.in);
		
		//Eragiketak
		for (i=0 ; i<=10 ; i++) {
			System.out.println("Eman zenbaki bat");
			zen=tek.nextInt();
			
			if(zen>han) {
			han=zen;
			}
			
			
			if(zen<txi) {
			txi=zen;
			}
		}
		System.out.println("Zenbakirik handiena " + han + " da eta zenbakirik txikiena " + txi + " da.");
		tek.close();
	}

}
