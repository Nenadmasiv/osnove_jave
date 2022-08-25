package d23_08_2022;

public class Transakcija {
//		        Kreirati klasu Transakcija koja ima:
//		id transakcije
//		racun sa kog se prenose sredstva
//		racun na koji se prenose sredstva
//		gettere i settere
//		konstruktore
//		privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//		ako je prenos sredstava manji od 4500, provizija je fiksna 45
//		ako je prenos sredstava veci od 4500, provizija je 1% 
//		S obzirom da se provizija racuna na osnovu visine transakcije, 
//		znaci da metoda prima parametar koji predstavlja visinu transakcije
//		Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju 
//		racunajte fiksnu proviziju u vrednosti od 45.
//		metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
//		Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//		Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), 
//		a na drugi racun dodaje samo (trazena suma).
//		(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
//		metodu koja stampa podatke o transakciji u formatu:
//		id transkacije
//		Racun sa: Ime i prezime  -  broj racuna
//		Racun na: Ime i prezime  -  broj racuna
	
	private String idTransakcije;
	private Racun saKogSePrenosi;
	private Racun naKojiSePrenosi;
	
	public Transakcija(String idTransakcije, Racun saKogSePrenosi, Racun naKojiSePrenosi) {
		super();
		this.idTransakcije = idTransakcije;
		this.saKogSePrenosi = saKogSePrenosi;
		this.naKojiSePrenosi = naKojiSePrenosi;
	}
	public String getIdTransakcije() {
		return idTransakcije;
	}
	public void setIdTransakcije(String idTransakcije) {
		this.idTransakcije = idTransakcije;
	}
	public Racun getSaKogSePrenosi() {
		return saKogSePrenosi;
	}
	public void setSaKogSePrenosi(Racun saKogSePrenosi) {
		this.saKogSePrenosi = saKogSePrenosi;
	}
	public Racun getNaKojiSePrenosi() {
		return naKojiSePrenosi;
	}
	public void setNaKojiSePrenosi(Racun naKojiSePrenosi) {
		this.naKojiSePrenosi = naKojiSePrenosi;
	}
//	privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//	ako je prenos sredstava manji od 4500, provizija je fiksna 45
//	ako je prenos sredstava veci od 4500, provizija je 1% 
//	S obzirom da se provizija racuna na osnovu visine transakcije, 
//	znaci da metoda prima parametar koji predstavlja visinu transakcije
	
	private double provizijaTrans(int prenos) {
		
		if (prenos < 4500) {
			return 45;
		}return prenos / 100;
	}
	
//	Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju 
//	racunajte fiksnu proviziju u vrednosti od 45.
//	metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. 
//	Kao parametar funkcije se unosi vrednost koja se prebacuje. 
//	Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), 
//	a na drugi racun dodaje samo (trazena suma).
//	(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
	
	public void izvrsiTransakciju(int prenos) {
		this.naKojiSePrenosi.promenaStanjaRac(prenos);
		this.saKogSePrenosi.promenaStanjaRac(- prenos - this.provizijaTrans(prenos));
	}
	
//	metodu koja stampa podatke o transakciji u formatu:
//	id transkacije
//	Racun sa: Ime i prezime  -  broj racuna
//	Racun na: Ime i prezime  -  broj racuna
	
	public void stampaj() {
		System.out.println(this.idTransakcije);
		System.out.println("Racun sa: " + this.saKogSePrenosi.getPunoIme() + " - " 
		+ this.saKogSePrenosi.getBrRacuna());
		System.out.println("Racun na: " + this.naKojiSePrenosi.getPunoIme() + " - " 
		+ this.naKojiSePrenosi.getBrRacuna());
		System.out.println();
	}




}
