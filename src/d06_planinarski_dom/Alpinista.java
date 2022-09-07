package d06_planinarski_dom;

public class Alpinista extends Planinar {
//	(20 poena) Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. 
//	Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) 
//	i poeni se mogu menjati. 
//	Alpinista može da savlada sve uspone do 4000 metara, 
//	placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, 
//	a informacije o alpinisti se ispisuju u formatu: 
//	Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 

	private int poeniAlpiniste;

	public Alpinista(int identifikacioniBroj, String punoIme, int poeniAlpiniste) {
		super(identifikacioniBroj, punoIme);
		this.poeniAlpiniste = poeniAlpiniste;
	}

	public int getPoeniAlpiniste() {
		return poeniAlpiniste;
	}

	public void setPoeniAlpiniste(int poeniAlpiniste) {
		this.poeniAlpiniste = poeniAlpiniste;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + this.getIdentifikacioniBroj() + " ime: " + this.getPunoIme()
				+ " Broj poena " + this.getPoeniAlpiniste());
	}

	@Override
	public int clanarinaPlaninara() {
		return 1500 - (this.poeniAlpiniste * 50);
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		return planina.getVisinaPlanine() <= 4000;
	}

}
