package Ariketa3_1;

public class PertsonakMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pertsonak pers1=new Pertsonak ("Ane", "Goikuria", 21, "Euskal Herria");
		Pertsonak pers2=new Pertsonak("Sofia", "Cañabate", 21, "Almeria");
		
		System.out.println(pers1.getIzena());
		pers1.setIzena("Aneee");
		System.out.println(pers1.getIzena());
		
		System.out.println(pers2.getAbizena());
		pers2.setAbizena("Cañavate");
		System.out.println(pers2.getAbizena());
		
	}

}
