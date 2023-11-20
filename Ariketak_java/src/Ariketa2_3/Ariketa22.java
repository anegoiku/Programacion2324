package Ariketa2_3;

import java.util.Scanner;

public class Ariketa22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Erabiltzaileak sartzen dituen 5 zenbakien faktoriala atera.
		
		//Bariableak
		int zen, fak, i;
		i=0;
		fak=1;
		Scanner tek=new Scanner(System.in);
		
		//Eragiketak eta erantzuna
		while(i<5) {
			System.out.println("Eman zenbaki bat eta bere faktoriala emango dizut");
			zen=tek.nextInt();
			
			while(zen!=0) {
				fak=fak*zen;
				zen--;
			}
			i++;
			System.out.println(fak);
			fak=1;
			}
		tek.close();
		
			System.out.println("BUKATUTA");
	}

}
