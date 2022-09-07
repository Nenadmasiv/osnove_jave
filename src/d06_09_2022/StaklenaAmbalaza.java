package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {
//	Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//	kaucija za flasu
//	atribut koji kaze da li se za flasu placa kaucija
//	osnovna cena
//	gettere i setter za atribute
//	konstuktori koji su vam potrebni
//	racuna cenu
//	ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//	ako se ne placa, (osnovna cena) * 1.2
//	metoda stampaj stampa sve podatke iz klase staklena flasa.

	private double kaucijZaFlasu;
	private boolean placaSeKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina, double kaucijZaFlasu,
			boolean placaSeKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucijZaFlasu = kaucijZaFlasu;
		this.placaSeKaucija = placaSeKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucijZaFlasu() {
		return kaucijZaFlasu;
	}

	public void setKaucijZaFlasu(double kaucijZaFlasu) {
		this.kaucijZaFlasu = kaucijZaFlasu;
	}

	public boolean isPlacaSeKaucija() {
		return placaSeKaucija;
	}

	public void setPlacaSeKaucija(boolean placaSeKaucija) {
		this.placaSeKaucija = placaSeKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

//	@Override
//	public double cenaArtikla() {
//		if (placaSeKaucija) {
//			return this.osnovnaCena * 1.2 + this.kaucijZaFlasu;
//		}
//		return this.osnovnaCena * 1.2;
//	}

	@Override
	public double cenaArtikla() {
		return this.placaSeKaucija ? this.osnovnaCena * 1.2 + this.kaucijZaFlasu : this.osnovnaCena * 1.2;
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
