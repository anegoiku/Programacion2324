package Ariketa2_6;

public class Ariketa7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main batean, erabili lehenaDa 1-etik 500-erako zenbaki lehen guztiak lerro bakarrean bistaratzeko.
		
		boolean lehen;
		for(int zen=1; zen<=500; zen++ ) {
			lehen=lehenaDa(zen);
			if(lehen==true) {
				System.out.print(zen + " ");
			}
		}
		
	}

	private static boolean lehenaDa(int zen) {
		boolean lehen = true;
		for (int i = 2; i < zen; i++) {
			if ((zen % i) == 0) {
				lehen = false;
			}
		}
		return lehen;
	}

}
