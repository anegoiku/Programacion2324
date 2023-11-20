package Ariketa2_6;

import java.util.Scanner;

public class Ariketa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Metodoa sortu, "diruKopurua" double-a eta "aldaketaTxanpona" char-a jasotzen
		// dituena. "D" jasotzen badu, kopurua eurotan dago eta dolarretara pasatu behar
		// da. "E" jasotzen badu, kontrako bihurketa burutu behar du. Jasotzen den
		// karakterea maiuskuletan edo minuskuletan egon daiteke.
		
		//Bariableak
		double diruKopurua, emaitza;
		char txanpona;
		Scanner tek=new Scanner(System.in);
		
		System.out.println("Sartu diru kopurua:");
		diruKopurua=tek.nextDouble();
		
		System.out.println("Ze diru mota da?");
		System.out.println("E(euro)");
		System.out.println("D(dolar)");
		txanpona=tek.next().charAt(0);
		
		emaitza=TxanponAldaketa(diruKopurua, txanpona);
		
		System.out.println("Aldaketa: " + emaitza);
	
		
		tek.close();

	}
	public static double TxanponAldaketa(double diruKopurua, char txanpona){
		double aldaketatasa= 1.18;
		char mayus = Character.toUpperCase(txanpona);
		
		if(mayus=='D') {
			return diruKopurua*aldaketatasa;
		}else if(mayus=='E') {
			return diruKopurua * aldaketatasa;
		}else {
			System.out.println("Txanpon okerra");
		}
	}

}
