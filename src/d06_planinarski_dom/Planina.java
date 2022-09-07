package d06_planinarski_dom;

public class Planina {
//	Kreirati klasu ​Planina ​koja od privatnih atributa ima: 
//	ime planine 
//	naziv države u kojoj se nalazi 
//	visinu planine. 
//	a od javnih metoda: 
//	default-ni konstruktor i konstuktor koji postavlja sve parametre 
//	gettere i settere za sve atribute 

	private String imePlanine;
	private String drzavaPlanine;
	private int visinaPlanine;

	public Planina() {
		super();
	}

	public Planina(String imePlanine, String drzavaPlanine, int visinaPlanine) {
		super();
		this.imePlanine = imePlanine;
		this.drzavaPlanine = drzavaPlanine;
		this.visinaPlanine = visinaPlanine;
	}

	public String getImePlanine() {
		return imePlanine;
	}

	public void setImePlanine(String imePlanine) {
		this.imePlanine = imePlanine;
	}

	public String getDrzavaPlanine() {
		return drzavaPlanine;
	}

	public void setDrzavaPlanine(String drzavaPlanine) {
		this.drzavaPlanine = drzavaPlanine;
	}

	public int getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(int visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}

}
