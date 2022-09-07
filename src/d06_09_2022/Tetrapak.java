package d06_09_2022;

public class Tetrapak extends Ambalaza {
//	Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//	atribut koji kaze da li se moze reciklirati
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.
//	racuna cenu tako da ispunjava uslova:
//	ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//	ako nije u cenu ulazi samo osnovna cena
//	metoda stampaj stampa sve podatke iz klase tetrapak.

	private boolean mozeSeReciklirati;
	private double osnovnaCena;

	public Tetrapak() {
		super();
	}

	public Tetrapak(String barkod, String nazivArtikla, int netoTezina, 
			int brutoTezina, boolean mozeSeReciklirati, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.mozeSeReciklirati = mozeSeReciklirati;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isMozeSeReciklirati() {
		return mozeSeReciklirati;
	}

	public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
		this.mozeSeReciklirati = mozeSeReciklirati;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

//	@Override
//	public double cenaArtikla() {
//		if (mozeSeReciklirati) {
//			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
//		}
//		return this.osnovnaCena;
//	}
	
	@Override
	public double cenaArtikla() {
		return mozeSeReciklirati ? this.tezinaPakovanja() * 1.5 + this.osnovnaCena : this.osnovnaCena;
	}

	@Override
	public void stampaj() {
		System.out.println("Naziv artikla: " + this.getNazivArtikla());
		System.out.println("Barkod artikla: " + this.getBarkod());
		System.out.println("Neto tezina: " + this.getNetoTezina());
		System.out.println("Bruto tezina: " + this.getBrutoTezina());
		System.out.println("Cena artikla: " + this.cenaArtikla());
		System.out.println();

	}

}
