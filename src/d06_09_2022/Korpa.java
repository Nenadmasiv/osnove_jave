package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
//	Kreirati klasu Korpa koja ima:
//	niz ambalaza
//	metodu dodaj ambalazu
//	metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//	privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//	metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
//	kao parametar funkcije se prima Super karticu iz koje se cita popust.

	ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();

	public Korpa() {
		super();
	}

	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if (this.ambalaze.get(i).getBarkod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}

	private double cenaSvihAmbalazaSaPopustom(int popust) {
		double suma = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			suma += this.ambalaze.get(i).cenaArtikla() - popust;
		}
		return suma;
	}

	public double ukupnaCenaKorpe(SuperKartica superKartica) {
		return this.cenaSvihAmbalazaSaPopustom(superKartica.getPopust());
	}

	public void stampaj() {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			this.ambalaze.get(i).stampaj();
		}
	}

}
