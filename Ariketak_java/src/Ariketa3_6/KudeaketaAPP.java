package Ariketa3_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class KudeaketaAPP {

	public static void main(String[] args) throws IOException {
		
		//PRIMIERO EL MENUUU
		
		Scanner tek=new Scanner(System.in);
		
		// IKASLEAK
		File fileikasleak=new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa3_6\\ikasleak.txt");
		FileReader frasle=new FileReader(fileikasleak);
		BufferedReader brasle=new BufferedReader(frasle);
		ArrayList<Ikaslea> ikaslelist=new ArrayList<Ikaslea>();
		
		String[] zatiakbat;
		String goiburuabat= brasle.readLine();
		String lerroabat=brasle.readLine();
		
		
		// IKASTAROAK
		File fileikastaroak=new File("C:\\Users\\1AW3-14\\Documents\\Copia de seguridad\\Ariketak_java\\src\\Ariketa3_6\\Ikastaroak.txt");
		FileReader fraro=new FileReader(fileikastaroak);
		BufferedReader braro=new BufferedReader(fraro);
		ArrayList<Ikastaroa> ikastarolist=new ArrayList<Ikastaroa>();
		
		String[] zatiakbi;
		String goiburuabi=braro.readLine();
		String lerroabi=braro.readLine();
		
		
		// IKASLEAK
		while(lerroabat!=null) {
			zatiakbat=lerroabat.split(";");
			Ikaslea ikasle=new Ikaslea();
			ikasle.setIzena(zatiakbat[0]);
			ikasle.setAdina(Integer.parseInt(zatiakbat[1]));
			
			for(int i=2; i<zatiakbat.length; i++) {
			
			}
			
			
		}
		
		// IKASTAROAK
		while(lerroabi!=null) {
			zatiakbi=lerroabi.split(";");
			Ikastaroa ikastaro=new Ikastaroa();
			ikastaro.setTituloa(zatiakbi[0]);
			ikastaro.setDescripzioa(zatiakbi[1]);
			ikastaro.setIrakaslea(zatiakbi[2]);
			
			for(int i=3; i<zatiakbi.length; i++) {
				
			}
		}
		
		
		
	}

}
