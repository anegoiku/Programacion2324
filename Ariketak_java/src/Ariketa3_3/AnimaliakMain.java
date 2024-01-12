package Ariketa3_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimaliakMain {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		File file=new File("C:\\Users\\1AW3-14\\git\\Programacion2324\\Ariketak_java\\src\\Ariketa3_3\\info.txt");
		Scanner tek=new Scanner(System.in);
		ArrayList<Animaliak> animalialist=new ArrayList<Animaliak>();
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		
		String lerroa;
		String[]zatiak;
		
		lerroa=br.readLine();
		
		while(lerroa!=null) {
			Animaliak animaliak=new Animaliak();
			zatiak=lerroa.split("::");
			animaliak.setIzena(zatiak[0]);
			animaliak.setEspeziea(zatiak[1]);
			animaliak.setAdina(Integer.parseInt(zatiak[2]));
			animaliak.setHabitat(zatiak[3]);
			
		}
		
	}

}
