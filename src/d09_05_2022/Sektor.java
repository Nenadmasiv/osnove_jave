package d09_05_2022;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//	 naziv sektora
//	 platu koja je za taj sektor
	
	private String nazivSektora;
	private int plata;
	public Sektor(String nazivSektora, int plata) {
		this.nazivSektora = nazivSektora;
		this.plata = plata;
	}
	public String getNazivSektora() {
		return nazivSektora;
	}
	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	
	
}
