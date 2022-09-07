package d09_05_2022;

import java.util.ArrayList;

public abstract class Radnik {
//	Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	private String punoIme;
	ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public Radnik(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	 public ArrayList<Sektor> getSektori(){
		 return sektori;
	 }
	 
	 
	public abstract double plata();

	public void zaposliUSektor(Sektor sektor) {
		this.sektori.add(sektor);
	}
}
