package Ariketa2_3;

public class Ariketa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//30 eta 50 artean dauden zenbaki bakoitien batuketa ateratzen duen programa idatzi.

		//Bariableak
		int i, zen;
		zen=0;
				
		//Eragiketak eta erantzuna
		for(i=30; i<=50; i++) {
			if (i%2==0) {
			}else {
			zen=zen+i;
			}
		}
		System.out.println("30 eta 50 arteko zenbakien batuketa " + zen + " da.");
	}

}
