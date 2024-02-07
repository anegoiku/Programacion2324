package Ariketa4_4;

public class MugikorTarifaLaua extends MugikorAurreordainketa {

	
    @Override
	public String toString() {
		return "MugikorTarifaLaua [Mugikor Zenbakia=" + mugikorZenb + ", Saldoa=" + getSaldoa() + "]";
	}

	public MugikorTarifaLaua(long mZ, float dEK, float dMK, float mBK, float s) {
		super(mZ, dEK, dMK, mBK, s);
		// TODO Auto-generated constructor stub
	}

	public void nabigatu(int mb) {
        setSaldoa(getSaldoa() - Math.round(0 * mb * 100f) / 100f);
        if (getSaldoa() < 0) {
            setSaldoa(0);
        }
    }
}
