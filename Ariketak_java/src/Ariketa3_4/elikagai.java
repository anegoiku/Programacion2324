package Ariketa3_4;

public class elikagai {
	private String iz;
	private String ego;
	private double kalo;
	private double koi;
	private double pro;
	private double kar;
	private String mota;

	public elikagai() {
		super();
	}

	public elikagai(String iz, String ego, double kalo, double koi, double pro, double kar, String mota) {
		super();
		this.iz = iz;
		this.ego = ego;
		this.kalo = kalo;
		this.koi = koi;
		this.pro = pro;
		this.kar = kar;
		this.mota = mota;
	}

	@Override
	public String toString() {
		return "elikagai [Izena=" + iz + ", Egoera=" + ego + ", Kaloriak=" + kalo + ", Koipeak=" + koi + ", Proteinak="
				+ pro + ", Karbohidratoak=" + kar + ", Mota=" + mota + "]";
	}

	public String getIz() {
		return iz;
	}

	public void setIz(String iz) {
		this.iz = iz;
	}

	public String getEgo() {
		return ego;
	}

	public void setEgo(String ego) {
		this.ego = ego;
	}

	public double getKalo() {
		return kalo;
	}

	public void setKalo(double kalo) {
		this.kalo = kalo;
	}

	public double getKoi() {
		return koi;
	}

	public void setKoi(double koi) {
		this.koi = koi;
	}

	public double getPro() {
		return pro;
	}

	public void setPro(double pro) {
		this.pro = pro;
	}

	public double getKar() {
		return kar;
	}
	
	public void setKar(double kar) {
		this.kar = kar;
	}
	
	public String getMota() {
		return mota;
	}
	
	public void setMota(String mota) {
		this.mota = mota;
	}

}
