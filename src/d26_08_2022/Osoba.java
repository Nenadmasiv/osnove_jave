package d26_08_2022;

public class Osoba {
//	Kreirati klasu Osoba koja ima:
//	ime i prezime
//	jmbg
//	godinu rodjenja
//	default-ni konstuktor
//	konstuktor sa parametrima
//	gettere i settere 
//	metodu stampaj koja stampa u formatu:
//	(ime i prezime), (jmbg), (godina rodjenja)

	protected String punoIme;
	protected String jmbg;
	protected int godRodjenja;

	public Osoba() {
		super();
	}

	public Osoba(String punoIme, String jmbg, int godRodjenja) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godRodjenja = godRodjenja;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public int getGodRodjenja() {
		return godRodjenja;
	}

	public void setGodRodjenja(int godRodjenja) {
		this.godRodjenja = godRodjenja;
	}

	public void stampaj() {
		System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godRodjenja);
	}

}
