package d18_08_2022;

import d18_08_2022.FacebookPost;

public class Domaci2 {

	public static void main(String[] args) {
//		Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			ime i prezime korisnika koji je objavio post
//			ime i prezime korisnika na kom je profilu objavljen post 
//			(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			tekst objave
//			broj lajkova
//			broj deljenja
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

		FacebookPost a = new FacebookPost();
		
		
		a.like();
		a.dislike();a.fullNameSharer = "Miki Gajic";
		a.fullNameOwner = "Nikoleta Stojanovic";
		a.text = "lepasi";
		a.like();
		a.dislike();
		a.dislike();
		a.share();
		a.print();
		
		FacebookPost b = new FacebookPost();
		
		b.fullNameSharer = "Nikoleta Stojanovic";
		b.fullNameOwner = "Miki Gajic";
		b.text = "Blok";
		
		b.like();
		b.like();
		b.like();
		b.like();
		b.dislike();
		b.share();
		b.print();


	}

}
