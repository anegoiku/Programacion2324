package Azterketa1;

import java.util.Scanner;

public class Ariketa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java-ko programa bat idatzi, non erabiltzaileak 0-100 tarteko kalifikazioa sartuko duen eta horren araberako mezua jasoko duen, hurrengo eskalaren arabera:
		
		//Bariableak
		int nota;
		Scanner scan=new Scanner(System.in);
		
		//Datuak
		System.out.println("Sartu 1-100 bitarteko zenbaki bat eta ze nota atera duzun esango dizut");
		nota=scan.nextInt();
		scan.close();
	
		
		//Eragiketak eta erantzunak
			if(nota>=90) {
				System.out.println("Zure nota A da, zorionaak!!");
				System.out.println("Programa bukaera");
			}else {
				if(nota>=80 && nota<=89) {
					System.out.println("Zure nota B da, oso ondoo!!");
					System.out.println("Programa bukaera");
				}else {
					if(nota>=70 && nota<=79) {
						System.out.println("Zure nota C da, ondoo!!");
						System.out.println("Programa bukaera");
					}else {
						if(nota>=60 && nota<=69) {
							System.out.println("Zure nota D da, hobetuu!!");
							System.out.println("Programa bukaera");
						}else {
							if(nota<60) {
								System.out.println("Zure nota F da, ooooooh:(");
								System.out.println("Programa bukaera");
							}
						}
					}
				}
			}
		

	}

}
