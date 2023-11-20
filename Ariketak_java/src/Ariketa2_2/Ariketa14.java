package Ariketa2_2;

import java.util.Scanner;

public class Ariketa14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hiru zenbaki eskatu eta ikustarazi txikienetik handienera.
		
		int zen1, zen2, zen3;
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Eman zenbaki bat");
		zen1=scan.nextInt();
		System.out.println("Eman beste zenbaki bat");
		zen2=scan.nextInt();
		System.out.println("Eman azken zenbaki bat");
		zen3=scan.nextInt();
		scan.close();
		
		//Eragiketak eta erantzunak
				if(zen1<zen2 && zen2<zen3) {
						System.out.println("Zenbakirik txikiena "+ zen1 + " da, gero " + zen2 + " eta azkenik " + zen3);
					}else {
					if(zen1<zen3 && zen3<zen2) {
						System.out.println("Zenbakirik txikiena "+ zen1 + " da, gero " + zen3 + " eta azkenik " + zen2);
						}
						
				}if(zen2<zen1 && zen1<zen3) {
						System.out.println("Zenbakirik txikiena "+ zen2 + " da, gero " + zen1 + " eta azkenik " + zen3);
					}else {
					if(zen2<zen3 && zen3<zen1) {
						System.out.println("Zenbakirik txikiena "+ zen2 + " da, gero " + zen3 + " eta azkenik " + zen1);
						}
					
				}if(zen3<zen2 && zen2<zen1) {
					System.out.println("Zenbakirik txikiena "+ zen3 + " da, gero " + zen2 + " eta azkenik " + zen1);
					}else {
					if(zen3<zen1 && zen1<zen2) {
					System.out.println("Zenbakirik txikiena "+ zen3 + " da, gero " + zen1 + " eta azkenik " + zen2);
						}
					}
			}
		}
		
		
		
		
		
	
	


