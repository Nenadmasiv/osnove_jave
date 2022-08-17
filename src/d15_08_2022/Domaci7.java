package d15_08_2022;

public class Domaci7 {

	public static void main(String[] args) {
//		Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. 
//		U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
		
		int y = najmanjiOdTri(4, 4, 6);
		System.out.println("Broj sa najmanjom vrednoscu je: " + y);


	}
	
	public static int najmanjiOdTri(int a, int b, int c) {
		if(a < b && a < c) {
			return a;
		}else if(b < a && b < c) {
			return b;
		}else if(c < a && c < b) {
			return c;
		}return 0;
	}

}
