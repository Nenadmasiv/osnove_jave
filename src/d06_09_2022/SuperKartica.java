package d06_09_2022;

public class SuperKartica {
//	Kreirati klasu SuperKartica koja ima:
//	broj kartice
//	ime i prezime vlasnika
//	popust (200, 500, … )
//	konstuktore (default-ni i sa parametrima)
//	gettere i settere 
//	metodu stampaj koja stampa karticu u formatu:
//	(broj kartice), (ime i prezime)

	private int brKartice;
	private String punoImeVlasnika;
	private int popust;

	public SuperKartica() {
		super();
	}

	public SuperKartica(int brKartice, String punoImeVlasnika, int popust) {
		super();
		this.brKartice = brKartice;
		this.punoImeVlasnika = punoImeVlasnika;
		this.popust = popust;
	}

	public int getBrKartice() {
		return brKartice;
	}

	public void setBrKartice(int brKartice) {
		this.brKartice = brKartice;
	}

	public String getPunoImeVlasnika() {
		return punoImeVlasnika;
	}

	public void setPunoImeVlasnika(String punoImeVlasnika) {
		this.punoImeVlasnika = punoImeVlasnika;
	}

	public int getPopust() {
		return popust;
	}

	public void setPopust(int popust) {
		this.popust = popust;
	}

	public void stampaj() {
		System.out.println("Ime: " + this.getPunoImeVlasnika() + ", Broj kartice: " + this.getBrKartice());
	}
}
