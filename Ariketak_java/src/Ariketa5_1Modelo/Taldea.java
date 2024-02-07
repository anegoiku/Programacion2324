package Ariketa5_1Modelo;

public class Taldea {
	private int idEquipo;
	private String iz;
	private String herria;
	
	
	@Override
	public String toString() {
		return "Taldea [idEquipo=" + idEquipo + ", Izena=" + iz + ", Herria=" + herria + "]";
	}
	
	
	public Taldea() {
	}
	
	public Taldea(int idEquipo, String iz, String herria) {
		this.idEquipo = idEquipo;
		this.iz = iz;
		this.herria = herria;
	}
	
	
	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	public String getIz() {
		return iz;
	}
	public void setIz(String iz) {
		this.iz = iz;
	}
	public String getHerria() {
		return herria;
	}
	public void setHerria(String herria) {
		this.herria = herria;
	}
	
	
}
