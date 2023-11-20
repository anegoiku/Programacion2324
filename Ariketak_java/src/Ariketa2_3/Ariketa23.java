package Ariketa2_3;

import java.util.Scanner;

public class Ariketa23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Menu bat atera, 1,2,3 aukerekin. Erabiltzaileak 4 sartzen badu, AGUR atera pantailatik. Bestela, erabiltzaileak aukeratutakoa atera.

		//Bariableak
		int zen;
		Scanner  tek=new Scanner(System.in);
		
		//Datuak
		System.out.println("Aukeratu: 1.Hiruren multiploa, 2.Fibonacci, 3.Faktoriala, 4.Irten");
		zen=tek.nextInt();
		
		//Eragiketak
		if(zen==1) {
		 System.out.println("Zure aukera hiruren multiploa da.");
		 		//Bariableak1
		 		int i1,zen1;
		 		zen1=7;
			
		 		//Eragiketak eta erantzuna1
		 		for(i1=0; i1<=10; i1++) {
				System.out.println(zen1 + " * " + i1  + " = " + zen1*i1);
		 		}
		 		
		}else {
			if(zen==2) {
			 System.out.println("Zure aukera fibonacci da.");	
			 		//Bariableak2
					int i2, zen12, zen22, zen32;
					zen12=0;
					zen22=1;
					zen32=0;
				
					//Eragiketa eta erantzuna2
					for(i2=0; i2<10; i2++) {
						zen32=zen12+zen22;
						zen12=zen22;
						zen22=zen32;
						System.out.println(zen12);
					}
				
			}else {
				if(zen==3) {
				 System.out.println("Zure aukera faktoriala da.");
				 		//Bariableak3
						int zen3, fak3;
						fak3=1;
						
						//Datuak3
						System.out.println("Eman zenbaki bat eta bere faktoriala emango dizut");
						zen3=tek.nextInt();
					
						//Eragiketaak eta erantzuna3
						while(zen3!=0) {
							fak3=fak3*zen3;
							zen3--;
						}	
						System.out.println(fak3);
				 
				}else {
					if(zen==4){
						System.out.println("IRTEN");
					}else {
						System.out.println("ERROREA");
					}
				}
			}
		}
		tek.close();
		
	}

}
