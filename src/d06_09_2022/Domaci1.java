package d06_09_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati abstraktnu klasu Ambalaza koja ima:
//			barkod (primer: 328232-2823)
//			naziv artikla
//			neto tezinu
//			bruto tezinu
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere
//			metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//			abstraktnu metodu koja vraca cenu artikla
//			abstraktnu metodu stampaj
//
//			Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//			atribut koji kaze da li se moze reciklirati
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu tako da ispunjava uslova:
//			ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//			ako nije u cenu ulazi samo osnovna cena
//			metoda stampaj stampa sve podatke iz klase tetrapak.
//
//			Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//			kaucija za flasu
//			atribut koji kaze da li se za flasu placa kaucija
//			osnovna cena
//			gettere i setter za atribute
//			konstuktori koji su vam potrebni
//			racuna cenu
//			ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//			ako se ne placa, (osnovna cena) * 1.2
//			metoda stampaj stampa sve podatke iz klase staklena flasa.
//
//			Kreirati klasu SuperKartica koja ima:
//			broj kartice
//			ime i prezime vlasnika
//			popust (200, 500, … )
//			konstuktore (default-ni i sa parametrima)
//			gettere i settere 
//			metodu stampaj koja stampa karticu u formatu:
//			(broj kartice), (ime i prezime)
//
//			Kreirati klasu Korpa koja ima:
//			niz ambalaza
//			metodu dodaj ambalazu
//			metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//			privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust. 
//			metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), 
//			kao parametar funkcije se prima Super karticu iz koje se cita popust.
//
//			U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih tipova 
//			i istestirati sve metode i ispisati ukupnu cenu sa popustom.

		Korpa k = new Korpa();

//		Tetrapak mleko = new Tetrapak("123-123-123", "Mleko", 120, 100, true, 230);
//		Tetrapak jogurt = new Tetrapak("123-234-123", "Jogurt", 120, 80, false, 220);
//		Tetrapak surutka = new Tetrapak("123-123-345", "Surutka", 130, 90, true, 120);
//
//		Ambalaza sok = new StaklenaAmbalaza("987-234-456", "Sok", 110, 90, 20, true, 150);
//		Ambalaza vino = new StaklenaAmbalaza("987-543-456", "Vino", 100, 90, 20, false, 160);
//		Ambalaza pivo = new StaklenaAmbalaza("987-234-365", "Pivo", 130, 100, 20, true, 160);

		k.dodajAmbalazu(new Tetrapak("123-123-123", "Mleko", 120, 100, true, 230));
		k.dodajAmbalazu(new Tetrapak("123-234-123", "Jogurt", 120, 80, false, 220));
		k.dodajAmbalazu(new Tetrapak("123-123-345", "Surutka", 130, 90, true, 120));
		k.dodajAmbalazu(new StaklenaAmbalaza("987-234-456", "Sok", 110, 90, 20, true, 150));
		k.dodajAmbalazu(new StaklenaAmbalaza("987-543-456", "Vino", 100, 90, 20, false, 160));
		k.dodajAmbalazu(new StaklenaAmbalaza("987-234-365", "Pivo", 130, 100, 20, true, 160));

		k.stampaj();

		k.izbaciAmbalazu("123-123-123");
		k.stampaj();

		SuperKartica superKartica = new SuperKartica(767865, "Mile Ilic", 100);
		superKartica.stampaj();

		System.out.println(k.ukupnaCenaKorpe(superKartica));

	}

}
