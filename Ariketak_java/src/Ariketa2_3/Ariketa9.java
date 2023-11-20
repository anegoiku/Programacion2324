package Ariketa2_3;

public class Ariketa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa bat idatzi, 1 eta 100 artean dauden zenbaki bikoitien batuketa
		// ateratzen duena eta zenbat zenbaki diren esaten duena.

		// Bariableak
		int i, tot, kont;
		i = 0;
		tot = 0;
		kont = 0;

		// Eragiketak
		while (i <= 100) {
			if (i % 2 == 0) {
				tot = tot + i;
				kont = kont + 1;
			}
			i++;
		}
		// Erantzuna
		System.out.println("1 eta 100 arteko zenbakien batura " + tot + " da");

	}

}
