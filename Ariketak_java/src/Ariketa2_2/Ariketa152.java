package Ariketa2_2;

import java.util.Scanner;

public class Ariketa152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5 zenbaki sartu eta ikustarazi zein den handiena eta zein txikiena.
		
		int zen, i;
		int han, txi;
		
		Scanner scan=new Scanner(System.in);
		
		han=0;
		txi=1000000000;
		
		
		
		//Eragiketak
		for (i=0; i<5; i++) {
			//Eman zenbakia
			System.out.println("Eman zenbaki bat");
			zen=scan.nextInt();
		if (zen>han) {
			han=zen;
		}if (zen<txi) {
			txi=zen;
			}
		}
		
		
		//Erantzuna
		System.out.println("Zenbakirik handiena " + han + " da eta txikiena " + txi + " da.");
		
		scan.close();
		
	}

}
