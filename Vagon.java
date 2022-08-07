package banditi;

import java.util.ArrayList;

public class Vagon {

	protected ArrayList <Bandit> banditi;
	

	
	public Vagon() {
		banditi=new ArrayList <Bandit>();
	}

	public void dodajBandita(Bandit b) {
		banditi.add(b);
	}
	
	public void ukloniBandita(Bandit b) {
		banditi.remove(b);
	}

	public boolean sadrziBandita(Bandit b) {
		return banditi.contains(b);
	}
	
	public int dohvatiBrojBandita() {
		return banditi.size();
	}
	
	public Bandit dohvatiBandita(int i) {
		return banditi.get(i);
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0;i<banditi.size()-1;i++) {
			sb.append(banditi.get(i));
			sb.append(",");
		}
		if(banditi.size()!=0)sb.append(banditi.get(banditi.size()-1));
		sb.append("]");
		return sb.toString();
	}

	public static void main(String[] args) {
		
	}
	
}
