package Ariketa4_3;



public class KontuKorrontea {
    public String iban;
    protected float saldoa;
    protected int sarreraKont;
    private float komisioPorz;
    

@Override
	public String toString() {
		return "KontuKorrontea [iban=" + iban + ", saldoa=" + saldoa + ", sarreraKont=" + sarreraKont + "]";
	}

KontuKorrontea (String iban, float komisioPorz) {
    this.iban = iban; 
    this.saldoa =0;
    this.komisioPorz = komisioPorz;
    this.sarreraKont = 0;
}   

public KontuKorrontea() {
	super();
}

public String getIban() {
	return iban;
}

public void setIban(String iban) {
	this.iban = iban;
}

public void setKomisioPorz (float komisioPorz) {
    this.komisioPorz = komisioPorz;
}
public float getKomisioPorz () {
	return komisioPorz;
	}
public float getSaldoa () {
	return (saldoa);
	}
public void setSaldoa(float saldoa) {
	this.saldoa=saldoa;
}
public int getSarreraKont() {
	return sarreraKont;
}
public void setSarreraKont(int sarreraKont) {
	this.sarreraKont = sarreraKont;
}
public void diruaSartu (float kopurua) {
    float bonus=0;
    if (++sarreraKont == 3) {
    	sarreraKont = 0; 
       bonus =0.7f;
    }    
    saldoa += kopurua + bonus;
}

public boolean diruaAtera (float kopurua) {
    float komisioa = komisioPorz * kopurua;
    if (kopurua + komisioa <= saldoa) {
       saldoa -= kopurua+komisioa;  //resta (importe+comision)
       sarreraKont = 0;
       return true;
    }
    else return false; 
}
}
