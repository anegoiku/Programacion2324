package Ariketa4_1;

public class Taxiak extends Ibilgailuak{
private int lizentziaZenbakia;

@Override
public String toString() {
	return "Taxiak [lizentziaZenbakia=" + lizentziaZenbakia + "]";
}

public int getLizentziaZenbakia() {
	return lizentziaZenbakia;
}

public void setLizentziaZenbakia(int lizentziaZenbakia) {
	this.lizentziaZenbakia = lizentziaZenbakia;
}



public Taxiak(String matrikula, String modeloa, int lizentziaZenbakia) {
	super(matrikula, modeloa);
	this.lizentziaZenbakia = lizentziaZenbakia;
}

public Taxiak(int lizentziaZenbakia) {
	this.lizentziaZenbakia = lizentziaZenbakia;
}

public Taxiak() {
	
}



}
