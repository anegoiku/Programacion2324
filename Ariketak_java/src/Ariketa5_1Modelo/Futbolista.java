package Ariketa5_1Modelo;

public class Futbolista {
	private String dni;
	private String iz;
	private String abiz;
	private int salario;
	private int idEquipo;
	
	
	@Override
	public String toString() {
		return "Futbolista [DNI=" + dni + ", Izena=" + iz + ", Abizena=" + abiz + ", Soldata=" + salario + ", idEquipo="
				+ idEquipo + "]";
	}
	
	
	public Futbolista() {
	}
	
	public Futbolista(String dni, String iz, String abiz, int salario, int idEquipo) {
		this.dni = dni;
		this.iz = iz;
		this.abiz = abiz;
		this.salario = salario;
		this.idEquipo = idEquipo;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getIz() {
		return iz;
	}
	public void setIz(String iz) {
		this.iz = iz;
	}
	public String getAbiz() {
		return abiz;
	}
	public void setAbiz(String abiz) {
		this.abiz = abiz;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getIdEquipo() {
		return idEquipo;
	}
	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}
	
	
}
