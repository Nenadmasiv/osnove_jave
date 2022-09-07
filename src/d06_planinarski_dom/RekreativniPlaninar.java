package d06_planinarski_dom;

public class RekreativniPlaninar extends Planinar {
//	(20 poena) Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. 
//	Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 
//	težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//	naziv okruga odakle je rekreativni planinar. 
//	maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//	da li će rekreativni planinar uspešno popeti na planinu zavisi 
//	da li je njegov najveći uspon manji od visine planine, 
//	s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi 
//	može da pređe 50 metara manje. 
//	rekeativci placaju clanarinu u iznosu od 1000 rsd
//	metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//	Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 
	
	private int tezinaOpremeKg;
	private String okrugRekreativnogPlaninara;
	private int maxUsponBezOpreme;

	public RekreativniPlaninar(int identifikacioniBroj, String punoIme, int tezinaOpremeKg,
			String okrugRekreativnogPlaninara, int maxUsponBezOpreme) {
		super(identifikacioniBroj, punoIme);
		this.tezinaOpremeKg = tezinaOpremeKg;
		this.okrugRekreativnogPlaninara = okrugRekreativnogPlaninara;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}

	public int getTezinaOpremeKg() {
		return tezinaOpremeKg;
	}

	public String getOkrugRekreativnogPlaninara() {
		return okrugRekreativnogPlaninara;
	}

	public int getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}

	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + this.getIdentifikacioniBroj() + " ime: " + this.getPunoIme()
				+ " Okrug: " + this.okrugRekreativnogPlaninara);
	}

	@Override
	public int clanarinaPlaninara() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		return (this.maxUsponBezOpreme - (this.tezinaOpremeKg * 50)) < planina.getVisinaPlanine();
	}

}
