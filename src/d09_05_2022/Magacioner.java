package d09_05_2022;

public class Magacioner extends Radnik{
	
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//	 suma plata svih sektor / broj sektora * 0.5
//	 override uje metodu za platu, tako da se plata racuna po formuli:
//	(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	public Magacioner(String punoIme) {
		super(punoIme);
	}
	private double prosecnaPlata() {
		double suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			suma += this.sektori.get(i).getPlata();
		}
		double prosecnaPlata = suma / this.sektori.size() * 0.5;
		return prosecnaPlata;
	}
	@Override
	public double plata() {
		double plata = this.prosecnaPlata() * this.sektori.size();
		return plata;
	}
	
//	public void stampaj() {
//		System.out.println("Magacioner: " + this.getPunoIme());
//		System.out.println("Plata: " + this.plata());
//	}
	

	
}
