package d26_08_2022;

public class Trener extends Osoba {

	private int godIskustva;
	private String tipTrenera;

	public Trener(String punoIme, String jmbg, int godRodjenja) {
		super(punoIme, jmbg, godRodjenja);
	}

	public int getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Godine iskustva: " + this.godIskustva);
		System.out.println(this.tipTrenera + " trener");
		System.out.println();
	}
	
}