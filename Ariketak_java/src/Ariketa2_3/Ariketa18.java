package Ariketa2_3;

import java.util.Scanner;

public class Ariketa18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbakiak eskattu erabiltzaileak 0 sartu arte eta sartutako zenbakien batazbestekoa atera.
		
		//Datuak
		int i, zen, batu;
		i=0;
		batu=0;
		Scanner tek=new Scanner (System.in);
		
		//Eragiketak
		System.out.println("Eman zenbaki bat");
		zen=tek.nextInt();
		
		while(zen!=0) {
			batu=batu+zen;
			i=i+1;
			System.out.println("Eman zenbaki bat");
			zen=tek.nextInt();
			}
		
		//Erantzuna
		System.out.println("Zenbaki guztien batazbestekoa " + batu/i + " da.");
		tek.close();
		
		
	}

}
