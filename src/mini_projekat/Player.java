package mini_projekat;

public class Player {
//	Kreirati klasu Player koja ima:
//	ime i prezime
//	gettere i settere
//	konstuktore
//	metodu print, koja stampa ime i prezime igraca
	
	private String punoIme;

	public Player() {
		super();
	}

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public void print() {
		System.out.println(this.punoIme);
	}

}
