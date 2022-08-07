package banditi;

import java.util.ArrayList;

public class Kompozicija {

	protected ArrayList <Vagon> vagoni;

	public Kompozicija() {
		vagoni = new ArrayList<Vagon>();
	}
	
	public void dodajVagon(Vagon v) {
		vagoni.add(v);
	}
	
	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
		
			for(int i=0;i<vagoni.size();i++) {
				if(vagoni.get(i).sadrziBandita(b))return vagoni.get(i);
			}
			throw new GNepostojeciVagon();

	}
	
	public int dohvatiBrojVagona() {
		return this.vagoni.size();
	}
	
	public Vagon dohvatiSusedniVagon(Vagon v, Smer s) throws GNepostojeciVagon {
		if(s==Smer.IZA) {
			int x =vagoni.indexOf(v)+1;
			if(x<vagoni.size()) return vagoni.get(x);
			throw new GNepostojeciVagon();
		}
		else if (s==Smer.ISPRED) {
			int x =vagoni.indexOf(v)-1;
			if(x>=0) return vagoni.get(x);
			throw new GNepostojeciVagon();
		}
		else throw new GNepostojeciVagon();
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(vagoni.size()==0) return null;
		for(int i=0;i<vagoni.size()-1;i++) {
			sb.append( vagoni.get(i));
			sb.append("_");
		}
		if(vagoni.size()!=0)sb.append(vagoni.get(vagoni.size()-1));
		
		return sb.toString();
	}
	
	
}
