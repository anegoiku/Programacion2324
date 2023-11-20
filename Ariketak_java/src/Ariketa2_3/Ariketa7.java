package Ariketa2_3;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa bat idatzi, 30 eta 50 zenbakien artean dauden zenbakien batuketa ateratzen duena.
		
		//Bariableak
		int i, zen;
		zen=0;
		
		//Eragiketak eta erantzuna
		for(i=30; i<=50; i++) {
			zen=zen+i;
		}
		System.out.println("30 eta 50 arteko zenbakien batuketa " + zen + " da.");
	}

}
