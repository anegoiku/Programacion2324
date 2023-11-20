package Ariketa2_4;

import java.util.Scanner;

public class Ariketa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// “ABCD” kateko karaktereak ASCII-ra pasatu. char erabili.

		// Bariableak
		String katea;
		Scanner tek = new Scanner(System.in);
		
		//Datuak
		System.out.println("Eman kate bat eta ASCII-ra pasatuko dut");
		katea=tek.nextLine();
		byte[] arrai_byte=katea.getBytes();
		tek.close();
		
		//Eragiketak
		for (int i=0;i<arrai_byte.length;i++){
			System.out.print(arrai_byte[i]+" "); 
			}
		
		
		
		
		
		
	}

}
