package Ariketa3_1;

public class Pertsonak {
	
	private String izena;
	private String abizena;
	private int adina;
	private String herrialdea;

	public Pertsonak(String izena, String abizena, int adina, String herrialdea) {
		super();
		this.izena = izena;
		this.abizena = abizena;
		this.adina = adina;
		this.herrialdea = herrialdea;
	}
	@Override
	public String toString() {
		return "Pertsonak [izena=" + izena + ", abizena=" + abizena + ", adina=" + adina + ", herrialdea=" + herrialdea
				+ "]";
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public int getAdina() {
		return adina;
	}

	public void setAdina(int adina) {
		this.adina = adina;
	}

	public String getHerrialdea() {
		return herrialdea;
	}

	public void setHerrialdea(String herrialdea) {
		this.herrialdea = herrialdea;
	}

}
