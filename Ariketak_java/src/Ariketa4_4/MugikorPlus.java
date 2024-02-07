package Ariketa4_4;

public class MugikorPlus extends MugikorAurreordainketa {

	private float deiIraupena;

	public float getDeiIraupena() {
		return deiIraupena;
	}

	public void setDeiIraupena(float deiIraupena) {
		this.deiIraupena = deiIraupena;
	}

	

	

	@Override
	public String toString() {
		return "MugikorPlus [Dei Iraupena=" + deiIraupena + ", Mugikor Zenbakia=" + mugikorZenb + ", Saldoa="
				+ getSaldoa() + "]";
	}

	public MugikorPlus(long mZ, float dEK, float dMK, float mBK, float s) {
		super(mZ, dEK, dMK, mBK, s);
	}

	public MugikorPlus(long mZ, float dEK, float dMK, float mBK, float s, float deiIraupena) {
		super(mZ, dEK, dMK, mBK, s);
		this.deiIraupena = deiIraupena;
	}

	public void BideoDeia(float deiIraupena) {
		setSaldoa(getSaldoa() - Math.round(2 * deiIraupena * 100f) / 100f);
        if (getSaldoa() < 0) {
            setSaldoa(0);
        }
	}
	

	
	
}
