package d06_planinarski_dom;

import java.util.ArrayList;

public class PlaninarskiDom {
//	(25 poena) Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//	naziv doma 
//	godinu kada je osnovan. 
//	članove doma koji su planinari (klasa vodi računa o nizu) 
//	Dok od javnih: 
//	default-ni konstuktor i konstuktor koji postavlja sve parametre 
//	gettere i settere koji su potrebni 
//	metodu učlani planinara, koja dodaje planinara u niz 
//	metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu 
//	(metoda za parametar prima Planinu za koju se proverava informacija) 
//	metodu koja izbacuje planinara iz planinarskog doma prema identifikacionom broju 
//	metodu koja štampa podatke o domu i o svim članovima doma
//	metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

	private String nazivDoma;
	private int godinaOsnivanjaDoma;
	ArrayList<Planinar> clanovidoma = new ArrayList<Planinar>();

	public PlaninarskiDom() {

	}

	public PlaninarskiDom(String nazivDoma, int godinaOsnivanjaDoma) {
		super();
		this.nazivDoma = nazivDoma;
		this.godinaOsnivanjaDoma = godinaOsnivanjaDoma;
	}

	public String getNazivDoma() {
		return nazivDoma;
	}

	public void setNazivDoma(String nazivDoma) {
		this.nazivDoma = nazivDoma;
	}

	public int getGodinaOsnivanjaDoma() {
		return godinaOsnivanjaDoma;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.clanovidoma.add(planinar);
	}

	public int brPlaninaraUspesnih(Planina planina) {
		int brojac = 0;
		for (int i = 0; i < this.clanovidoma.size(); i++) {
			if (this.clanovidoma.get(i).uspesanUspon(planina)) {
				brojac++;
			}
		}
		return brojac;
	}

	public void izbacujePlaninaraPremaId(int identifikacioniBroj) {
		for (int i = 0; i < this.clanovidoma.size(); i++) {
			if (this.clanovidoma.get(i).getIdentifikacioniBroj() == identifikacioniBroj) {
				this.clanovidoma.remove(i);
			}
		}
	}

	public void stampaj() {
		System.out.println("Planinarski Dom: " + this.getNazivDoma() + " , Osnovan: " + this.getGodinaOsnivanjaDoma());
		for (int i = 0; i < this.clanovidoma.size(); i++) {
			this.clanovidoma.get(i).stampaj();
		}
	}

	public int mesecniPrihod() {
		int suma = 0;
		for (int i = 0; i < this.clanovidoma.size(); i++) {
			suma += this.clanovidoma.get(i).clanarinaPlaninara();
		}
		return suma;
	}
}
