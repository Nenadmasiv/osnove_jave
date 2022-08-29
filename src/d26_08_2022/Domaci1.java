package d26_08_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati klasu Osoba koja ima:
//			ime i prezime
//			jmbg
//			godinu rodjenja
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere 
//			metodu stampaj koja stampa u formatu:
//			(ime i prezime), (jmbg), (godina rodjenja)
//
//			Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//			broj (broj koji igrac nosi)
//			poziciju koju igra (odbrambeni, napadac, … )
//			kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//			default-ni konstuktor
//			konstuktor sa parametrima
//			gettere i settere za broj, kapiten i poziciju
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//			Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//			godine iskustva
//			tip trenera (kondicioni, za igru, pomocni, personalni)
//			metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//			U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
//
//
//			(Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, 
//			na kraju programa ispisati sve igrace i trenere. 
//			Podatke za igrace i trenere unosi korisnik sa tastature.

		Igrac ig1 = new Igrac("Dusan Tadic", "87575654", 1985, 10, "Napadac", true);
		Igrac ig2 = new Igrac("Luka Jovic", "398273984", 1997, 21, "Napadac", false);

		ig1.stampaj();
		ig2.stampaj();

		Trener tr1 = new Trener("Radomir Antic", "098696987", 1956);
		Trener tr2 = new Trener("Slobodan Santrac", "892347283", 1958);
		
		tr1.setGodIskustva(17);
		tr1.setTipTrenera("Kondicioni");
		tr2.setGodIskustva(12);
		tr2.setTipTrenera("Glavni");
		
		tr1.stampaj();
		tr2.stampaj();

	}

}
