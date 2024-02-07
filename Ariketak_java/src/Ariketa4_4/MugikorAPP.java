package Ariketa4_4;

import java.util.Scanner;

public class MugikorAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tek=new Scanner(System.in);
		MugikorAurreordainketa mugi1=new MugikorAurreordainketa(688890580, 50, 3, 8, 100);
		MugikorPlus mugi2=new MugikorPlus(677938331, 50, 3, 8, 50);
		MugikorTarifaLaua mugi3=new MugikorTarifaLaua(657728629, 50, 3, 8, 200);

		int menu = 0;
		do {
			System.out.println("-----MENUA-----");
			System.out.println("1. Deitu");
			System.out.println("2. Nabigatu");
			System.out.println("3. Bideodeia");
			System.out.println("4. Saldoa bistaratu");
			System.out.println("5. Saldoa birkargatu");
			System.out.println("6. IRTEN");
			System.out.println("---------------");
			menu = tek.nextInt();
			
		switch(menu) {
		case 1:
			System.out.println("Zein da zure mugikor zenbakia?");
			long zen=tek.nextLong();
			if(zen==mugi1.mugikorZenb) {
				mugi1.efectuarLlamada(20);
				System.out.println(mugi1.toString());
			}else if(zen==mugi2.mugikorZenb) {
				mugi2.efectuarLlamada(20);
				System.out.println(mugi2.toString());
			}else if(zen==mugi3.mugikorZenb) {
				mugi3.efectuarLlamada(20);
				System.out.println(mugi3.toString());
			}
			break;
		
		case 2:
			System.out.println("Zein da zure mugikor zenbakia?");
			 zen=tek.nextLong();
			if(zen==mugi1.mugikorZenb) {
				mugi1.nabigatu(20);
				System.out.println(mugi1.toString());
			}else if(zen==mugi2.mugikorZenb) {
				mugi2.nabigatu(20);
				System.out.println(mugi2.toString());
			}else if(zen==mugi3.mugikorZenb) {
				mugi3.nabigatu(20);
				System.out.println(mugi3.toString());
			}
			break;
			
		case 3:
			System.out.println("Zein da zure mugikor zenbakia?");
			 zen=tek.nextLong();
			if(zen==mugi1.mugikorZenb) {
				System.out.println("Tarifa honekin ezin da bideo deia egin");
				System.out.println(mugi1.toString());
			}else if(zen==mugi2.mugikorZenb) {
				mugi2.BideoDeia(20);
				System.out.println(mugi2.toString());
			}else if(zen==mugi3.mugikorZenb) {
				System.out.println("Tarifa honekin ezin da bideo deia egin");
				System.out.println(mugi3.toString());
			}
			break;
			
		case 4:
			System.out.println("Zein da zure mugikor zenbakia?");
			 zen=tek.nextLong();
			if(zen==mugi1.mugikorZenb) {
				mugi1.saldoaKontsultatu();
				System.out.println(mugi1.toString());
			}else if(zen==mugi2.mugikorZenb) {
				mugi2.saldoaKontsultatu();
				System.out.println(mugi2.toString());
			}else if(zen==mugi3.mugikorZenb) {
				mugi3.saldoaKontsultatu();
				System.out.println(mugi3.toString());
			}
			break;
			
		case 5:
			System.out.println("Zein da zure mugikor zenbakia?");
			 zen=tek.nextLong();
			if(zen==mugi1.mugikorZenb) {
				mugi1.birkargatu(20);
				System.out.println(mugi1.toString());
			}else if(zen==mugi2.mugikorZenb) {
				mugi2.birkargatu(20);
				System.out.println(mugi2.toString());
			}else if(zen==mugi3.mugikorZenb) {
				mugi3.birkargatu(20);
				System.out.println(mugi3.toString());
			}
			break;
			
		case 6:
			System.out.println("AMAIERA!! Laster arte!!");
			break;
			
		default:
			System.out.println("ERROREA");
		}

		}while(menu!=6);
	}

}
