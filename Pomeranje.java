package banditi;

public class Pomeranje extends Akcija {

	
	Smer s;
	
	public Pomeranje(Kompozicija k,Smer s) {
		super(k);
		this.s=s;
	}

	@Override
	public void izvrsi(Bandit b) throws GNepostojeciVagon{
		try {
			Vagon v=k.dohvatiVagon(b);
			Vagon v2=k.dohvatiSusedniVagon(v, s);
			v.ukloniBandita(b);
			v2.dodajBandita(b);
		} catch (Exception e) {
		}	
		

	}

	@Override
	public String toString() {
		return "Pomeranje: " + s;
	}
	
	
	
	
}
