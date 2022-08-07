package main;
import banditi.*;

public class Test {
	public static void main(String[] args) {
		Vagon vagon1 = new Vagon();
		for (int i = 0; i < 6; i++) {
			Bandit bandit = new Bandit(i % 2 == 0 ? Bandit.Tim.A : Bandit.Tim.B);
			bandit.promeniBrojZlatnika((int) (Math.random() * 20 - 10));
			vagon1.dodajBandita(bandit);
		}
		int zlatniciA = 0, zlatniciB = 0;
		for (int i = 0; i < vagon1.dohvatiBrojBandita(); i++) {
			Bandit trenutni = vagon1.dohvatiBandita(i);
			if (trenutni.dohvatiTim() == Bandit.Tim.A) {
				zlatniciA += trenutni.dohvatiBrojZlatnika();
			} else {
				zlatniciB += trenutni.dohvatiBrojZlatnika();
			}
		}
		System.out.println(vagon1);
		System.out.println("Bogatiji tim je tim " + (zlatniciA > zlatniciB ? "A" : "B"));
		if (vagon1.sadrziBandita(vagon1.dohvatiBandita(0))) {
			vagon1.ukloniBandita(vagon1.dohvatiBandita(0));
		}
		Vagon vagon2 = new Vagon(); Kompozicija kompozicija = new Kompozicija();
		kompozicija.dodajVagon(vagon1); kompozicija.dodajVagon(vagon2);
		try {
			Vagon v3=kompozicija.dohvatiSusedniVagon(vagon2, Smer.IZA);
			System.out.println(v3);
		} catch (GNepostojeciVagon e1) {
			System.out.println("USLO");
		}
		System.out.println(kompozicija);
		try {
			Vagon vagon = kompozicija.dohvatiVagon(new Bandit(Bandit.Tim.A));
			System.out.println("Postoji bandit u vagonu: " + vagon);
			} catch (GNepostojeciVagon e) { System.out.println("Ne postoji vagon."); }
	}
}