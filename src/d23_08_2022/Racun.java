package d23_08_2022;

public class Racun {
//	Kreirati klasu Racun koja ima:
//		broj racuna (npr: 170-289328923-23)
//		ime i prezime osobe
//		trenutno stanje na racunu (npr: 100, 1220)
//		gettere i setter za sve atribute, sem settera za stanje na racunu
//		metodu koja menja stanje na racunu za prosledjenu vrednost 
//		(stanje na racunu ne moze da bude manje od nule)
//		metodu koja stampa podatke o racunu u formatu:
//		Ime i prezime  -  broj racuna
//		stanje na racunu je (trenutno stanje) rsd.

	private String brRacuna;
	private String punoIme;
	private double trenutStanjeRac;

	public Racun(String brRacuna, String punoIme, double trenutStanjeRac) {
		super();
		this.brRacuna = brRacuna;
		this.punoIme = punoIme;
		this.trenutStanjeRac = trenutStanjeRac;
	}

	public String getBrRacuna() {
		return brRacuna;
	}

	public void setBrRacuna(String brRacuna) {
		this.brRacuna = brRacuna;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getTrenutStanjeRac() {
		return trenutStanjeRac;
	}

	public void setTrenutStanjeRac(double trenutStanjeRac) {
		this.trenutStanjeRac = trenutStanjeRac;
	}

//	metodu koja menja stanje na racunu za prosledjenu vrednost 
//	(stanje na racunu ne moze da bude manje od nule)
//	metodu koja stampa podatke o racunu u formatu:
//	Ime i prezime  -  broj racuna
//	stanje na racunu je (trenutno stanje) rsd.

	public void promenaStanjaRac(double prenos) {
		this.trenutStanjeRac += prenos;
//		if (this.trenutStanjeRac - prenos < 0) {
//			this.trenutStanjeRac == this.trenutStanjeRac;
//		}
	}

	public void stampaj() {
		System.out.println(this.punoIme + " - " + this.brRacuna);
		System.out.println("Stanje na racunu je " + this.trenutStanjeRac + " rsd.");
		System.out.println();
	}

}
