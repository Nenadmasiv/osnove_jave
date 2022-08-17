package d16_08_2022;

public class Domaci2 {

	public static void main(String[] args) {
//		Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu 
//		atribut za mod (hladi/greje) - string
//		metodu za stampu (proizvoljno)
//		metodu koja vraca informaciju da li je napolju veca temperatura 
//		od one na koju je klima postavljena. 
//		Metoda kao parametar prima temperaturu koja je napolju.
//
//
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning 
//		i za svaki od njih pozvati metode

		SmartAirConditioning klima1 = new SmartAirConditioning();
		klima1.marka = "Samsung";
		klima1.temperatura = 36;
		klima1.mod = "Grejanje";

		SmartAirConditioning klima2 = new SmartAirConditioning();
		klima2.marka = "Galanz";
		klima2.temperatura = 15;
		klima2.mod = "Hladjenje";

		klima1.stampaj();

		if (klima1.temp(5) == true) {
			System.out.println("Napolju je veca temperatura.");
		} else {
			System.out.println("Napolju je manja temperatura.");
		}

		klima2.stampaj();

		if (klima2.temp(36) == true) {
			System.out.println("Napolju je veca temperatura.");
		} else {
			System.out.println("Napolju je manja temperatura.");
		}

	}

}
