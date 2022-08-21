package d19_08_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
//			 Konstruktore:
//			difoltni konstuktor
//			konstuktor koji postavlja ime i prezime korisnika ko je objavio, 
//			korisnika na kom je profilu objavnljen i tekst objave
//			  Od metoda:
//			like(), koja povecava broj lajkova za 1.
//			dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			share(), koja povecava broj deljenja za 1
//			print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a 
//			i nad svakim pozvati svaku funkciju.
//
//
//			Primer stampanja:
//			Milan Jovanovic >>> Pera Peric
//			Ovo je tekst objave
//			Likes 3 | Shares 1
			
		FacebookPost f = new FacebookPost(
				"Zdarvko Colic", "Konstantin Filosof", 
				"Kolko su ti te musmule sto prodajes? ");
		f.like();
		f.dislike();
		f.dislike();
		f.share();
		f.print();
		
		FacebookPost g = new FacebookPost();
		g.SetFullNameSharer("Konstantin Filosof");
		g.SetFullNameOwner("Zdravko Colic");
		g.SetText("Javi se u inbox.");
		g.like();
		g.like();
		g.like();
		g.like();
		g.dislike();
		g.share();
		g.print();
		
		


	}

}
