package Ariketa4_3;

final public class KontuEpea extends KontuKorrontea{
public String sortzeData;

public String getSortzeData() {
	return sortzeData;
}

public void setSortzeData(String sortzeData) {
	this.sortzeData = sortzeData;
}


public KontuEpea(String iban, float komisioPorz, String sortzeData) {
	super(iban, komisioPorz);
	this.sortzeData = sortzeData;
}


public KontuEpea() {
	super();
}

@Override
public String toString() {
	return "KontuEpea [Iban=" + iban + ", Saldoa=" + saldoa + ", Sarrera kontadorea=" + sarreraKont + ", SortzeData=" + sortzeData + "]";
}

public boolean diruaAtera(float kopurua, float saldoa, int sarreraKont) {
	if(kopurua<=saldoa) {
		saldoa-=kopurua;
		sarreraKont=0;
		return true;
	}else return false;
}
}
