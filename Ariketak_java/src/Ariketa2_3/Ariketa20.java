package Ariketa2_3;

public class Ariketa20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fibonacci segidako lehenengo 10 zenbakiak atera.
		
		//Bariableak
		int i, zen1, zen2, zen3;
		zen1=0;
		zen2=1;
		zen3=0;
		
		//Eragiketa eta erantzuna
		for(i=0; i<10; i++) {
			zen3=zen1+zen2;
			zen1=zen2;
			zen2=zen3;
			System.out.println(zen1);
		}
		
		
		
	}

}
