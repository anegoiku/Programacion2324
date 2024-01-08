package Ariketa3_2;

public class Auricular {
	
private String modeloa;
private String marka;
private double prezioa;
private int stock;

public Auricular() {}

public Auricular(String modeloa, String marka, double prezioa, int stock) {
	super();
	this.modeloa = modeloa;
	this.marka = marka;
	this.prezioa = prezioa;
	this.stock = stock;
}


public String getModeloa() {
	return modeloa;
	
}

public void setModeloa(String modeloa) {
	this.modeloa = modeloa;
}

public String getMarka() {
	return marka;
}

public void setMarka(String marka) {
	this.marka = marka;
}

public double getPrezioa() {
	return prezioa;
}

public void setPrezioa(double prezioa) {
	this.prezioa = prezioa;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}


@Override
public String toString() {
	return "Auricular [modeloa=" + modeloa + ", marka=" + marka + ", prezioa=" + prezioa + ", stock=" + stock + "]";
}

}
