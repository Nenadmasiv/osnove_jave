package d26_08_2022;

public class Igrac extends Osoba {
//	Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//	broj (broj koji igrac nosi)
//	poziciju koju igra (odbrambeni, napadac, … )
//	kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere za broj, kapiten i poziciju
//	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

	private int brojIgraca;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(String punoIme, String jmbg, int godRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj koji nosi na ledjima: " + this.brojIgraca);
		System.out.println("Pozicija na kojoj igra: " + this.pozicija);
		if (this.isKapiten() == true) {
			System.out.println("Kapiten!");

		}
		System.out.println();
	}

}
