package d15_08_2022;

public class Domaci3 {

	public static void main(String[] args) {
//		Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije 
//		vraca novu vrednost koja se formira kao na primeru. 
//		METODA NISTA NE STAMPA.
//		ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//		ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
		
		int x = konvertomat(2,3);
		System.out.println(x);


	}
	
	public static int konvertomat(int a, int b) {
		return a *10 + b;
	}

}
