package d15_08_2022;

public class Domaci6 {

	public static void main(String[] args) {
//		Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//		Primer izvrsenja: 
//		izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//		izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
//
//		Napomena: Resiti bez koriscenja petlji. 

		int k = kolicinaCelihBr(0, -5);
		System.out.println(k);

	}

	public static int kolicinaCelihBr(int a, int b) {
		if (a > b && a >= 0 && b >= 0) {
			return a - b - 1;
		} else if (b > a && a >= 0 && b >= 0) {
			return b - a - 1;
		} else if (a < 0 && b > 0) {
			return b - a - 1;
		} else if (a > 0 && b < 0) {
			return a - b - 1;
		} else if (a < b && a <= 0 && b <= 0) {
			return ((a - b) * -1) - 1;
		} else if (a > b && a <= 0 && b <= 0) {
			return ((b - a) * -1) - 1;
		}
		return 0;
	}

}
