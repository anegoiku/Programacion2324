package Ariketa3_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KudeaketaAPP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner tek=new Scanner(System.in);
		File fileikasleak=new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa3_6\\ikasleak.txt");
		FileReader frasle=new FileReader(fileikasleak);
		BufferedReader brasle=new BufferedReader(frasle);
		ArrayList<Ikaslea> ikaslelist=new ArrayList<Ikaslea>();
		
		String[] zatiak;
		String goiburua= brasle.readLine();
		String lerroa=brasle.readLine();
		
		while(lerroa!=null) {
			zatiak=lerroa.split(";");
			Ikaslea ikasle=new Ikaslea();
			ikasle.setIzena(zatiak[0]);
			ikasle.setAdina(Integer.parseInt(zatiak[1]));
			
		}
		
		
	}

}
