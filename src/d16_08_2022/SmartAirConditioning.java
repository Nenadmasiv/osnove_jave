package d16_08_2022;

public class SmartAirConditioning {
//	Kreirati klasu SmartAirConditioning koja ima:
//	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//	atribut za izabranu temperaturu 
//	atribut za mod (hladi/greje) - string
//	metodu za stampu (proizvoljno)
//	metodu koja vraca informaciju da li je napolju veca temperatura 
//	od one na koju je klima postavljena. 
//	Metoda kao parametar prima temperaturu koja je napolju.
//
//
//	U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning 
//	i za svaki od njih pozvati metode
	
	public String marka;
	public double temperatura;
	public String mod;
	
	public void stampaj() {
		System.out.println(this.marka);
		System.out.println("Trenutna temperatura je " + this.temperatura + "c");
		System.out.println("Mod: " + this.mod);
	}
	
	public boolean temp(int spoljasnjaTemp) {
		if(spoljasnjaTemp > this.temperatura) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
