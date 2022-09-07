package d09_05_2022;

public class Menadzer extends Radnik {

//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//	 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	public Menadzer(String punoIme) {
		super(punoIme);
	}

	@Override
	public double plata() {
		int suma = 0;
		for (int i = 0; i < this.sektori.size(); i++) {
			suma += this.sektori.get(i).getPlata();
		}
		return suma;
	}
//	public void stampaj() {
//		System.out.println("Menadzer: " + this.getPunoIme());
//		System.out.println("Plata: " + this.plata());
//	}

	
	
}
