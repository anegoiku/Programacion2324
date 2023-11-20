package Ariketa2_2;

import java.util.Scanner;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Zenbaki bat 1 eta 7ren artean eskatu eta horri dagokion asteko eguna zein den zehaztu.
		
		int zen;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman 1 eta 7 arteko zenbaki bat");
		zen = scan.nextInt();
		scan.close();
		
		if (zen==1) {
			System.out.println(zen+" astelehena da");
		}else {
			if(zen==2) {
				System.out.println(zen+" asteartea da");
			}else {
				if(zen==3) {
					System.out.println(zen+" asteazkena da");
				}else {
					if(zen==4) {
						System.out.println(zen+" osteguna da");
					}else {
					if(zen==5) {
						System.out.println(zen+" ostirala da");
					}else {
						if(zen==6) {
							System.out.println(zen+" larunbata da");
						}else {
							if(zen==7) {
								System.out.println(zen+" igandea da");
							}else {
								System.out.println(zen+" ez da 1 eta 7 arteko zenbaki bat");
							}
						}
					}	
					}
				}
			}
		}
	}

}
