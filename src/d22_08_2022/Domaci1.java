package d22_08_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//		    U glavnom programu napraviti vise autora sa vise knjiga.
		
		Autor autor1 = new Autor("Dobrica", "Cosic");
		Knjiga knjiga1 = new Knjiga("978-3-16-148410-0", "Seobe", 1956, autor1);
		knjiga1.print();
		
		Autor autor2 = new Autor("Branko", "Copic");
		Knjiga knjiga2 = new Knjiga("973-10-023-498", "Hajduci", 1964, autor2);
		knjiga2.print();
		
		Autor autor3 = new Autor("Svetislav", "Pesic");
		Knjiga knjiga3 = new Knjiga("97234-234-333-0", "Moja igra", 2022, autor3);
		knjiga3.print();


	}

}
