package Ariketa4_1;

public class Ibilgailuak {
private String matrikula;
private String modeloa;
private int potentzia;
private int plazakopurua;
private String kolorea;

@Override
public String toString() {
	return "Ibilgailuak [matrikula=" + matrikula + ", modeloa=" + modeloa + ", potentzia=" + potentzia
			+ ", plazakopurua=" + plazakopurua + ", kolorea=" + kolorea + "]";
}


public Ibilgailuak() {
	
}

public Ibilgailuak(String matrikula, String modeloa) {
	
	this.matrikula = matrikula;
	this.modeloa = modeloa;
}



public Ibilgailuak(String matrikula, String modeloa, int potentzia, int plazakopurua, String kolorea) {
	
	this.matrikula = matrikula;
	this.modeloa = modeloa;
	this.potentzia = potentzia;
	this.plazakopurua = plazakopurua;
	this.kolorea = kolorea;
}


public String getMatrikula() {
	return matrikula;
}

public void setMatrikula(String matrikula) {
	this.matrikula = matrikula;
}

public String getModeloa() {
	return modeloa;
}

public void setModeloa(String modeloa) {
	this.modeloa = modeloa;
}

public int getPotentzia() {
	return potentzia;
}

public void setPotentzia(int potentzia) {
	this.potentzia = potentzia;
}

public int getPlazakopurua() {
	return plazakopurua;
}

public void setPlazakopurua(int plazakopurua) {
	this.plazakopurua = plazakopurua;
}

public String getKolorea() {
	return kolorea;
}

public void setKolorea(String kolorea) {
	this.kolorea = kolorea;
}

}
