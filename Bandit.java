package banditi;

public class Bandit {

	public enum Tim{A,B}
	protected Tim tim;
	protected int zlatnici=50;
	
	public Bandit(Tim tim) {
		this.tim=tim;
	}

	public int dohvatiBrojZlatnika() {
		return zlatnici;
	}

	public void promeniBrojZlatnika(int zlatnici) {
		this.zlatnici += zlatnici;
	}

	public Tim dohvatiTim() {
		return tim;
	}

	@Override
	public String toString() {
		return this.tim.toString() + this.zlatnici;
	}

}
