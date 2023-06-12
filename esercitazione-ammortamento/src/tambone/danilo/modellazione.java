package tambone.danilo;
import tambone.danilo.TestFinanziamento;


public class modellazione extends TestFinanziamento 
{
public long importo;
public int rate, tasso, durata;

public modellazione(long importo, int rate, int tasso, int durata) {
	super();
	this.importo = importo;
	this.rate = rate;
	this.tasso = tasso;
	this.durata = durata;
}



public long getImporto() {
	return importo;
}
public void setImporto(long importo) {
	this.importo = importo;
}
public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
public int getTasso() {
	return tasso;
}
public void setTasso(int tasso) {
	this.tasso = tasso;
}
public int getDurata() {
	return durata;
}
public void setDurata(int durata) {
	this.durata = durata;
}

	
	static void calcolo(long importo, int tasso, int durata, int rate)
	{
		double tassoEff = tasso/100;
		double quotaInteressi = (((importo * tasso) * durata) / rate );
		System.out.println(quotaInteressi);
	}
	
	
    
}
