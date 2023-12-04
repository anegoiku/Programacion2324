package Ariketa2_6;

import java.util.Scanner;

public class Ariketa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metodo bat sortu, pantailatik txanpon ezberdinen arteko trukea egin duena. 
		//Metodoak txanponIn-etik txanponOut-era. Hiru parametro jasoko ditu:
		//1. double kantitatea
		//2. char txanponIn: E, D edo B (euro, dolar edo bitcoin)
		//3. char txanponOut: E, D edo B

		
		//Bariableak
		double kantitatea, emaitza;
		char txanponIn, txanponOut;
		
		Scanner tek=new Scanner (System.in);
		
		//Datuak eskatu
		System.out.println("Zein da diru kopurua?");
		kantitatea=tek.nextDouble();
		
		System.out.println("Zein motatan dago?");
		System.out.println("E (euro)");
		System.out.println("D (dolar)");
		System.out.println("B (bitcoin)");
		txanponIn=tek.next().charAt(0);
		
		System.out.println("Zein txanpon motara nahi duzu aldatu?");
		System.out.println("E (euro)");
		System.out.println("D (dolar)");
		System.out.println("B (bitcoin)");
		txanponOut=tek.next().charAt(0);
		
		//Erantzuna
		emaitza=TxanponAldaketa(kantitatea, txanponIn, txanponOut);
		System.out.println("Aldaketa: " + emaitza);
		tek.close();
	}
	
	//Metodoa
	private static double TxanponAldaketa(double kantitatea, char txanponIn, char txanponOut) {
	
		char mayusIn=Character.toUpperCase(txanponIn);
		char mayusOut=Character.toUpperCase(txanponOut);
		double metodoemaitza=0;
		
		if(mayusIn=='D') {
		}else if(mayusOut=='E') {
			metodoemaitza=kantitatea*0.92;
		}else if(mayusOut=='B') {
			metodoemaitza=kantitatea*0.000028;
		}
		
		if(mayusIn=='E') {
		}else if(mayusOut=='D') {
			metodoemaitza=kantitatea*1.09;
		}else if(mayusOut=='B') {
			metodoemaitza=kantitatea*0.000030;
		}
		
		if(mayusIn=='B') {
		}else if(mayusOut=='E') {
			metodoemaitza=kantitatea*32984.01;
		}else if(mayusOut=='D') {
			metodoemaitza=kantitatea*35827.10;
		}
		return metodoemaitza;
		
	}

}
