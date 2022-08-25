package d23_08_2022;

import java.util.ArrayList;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati klasu ZeleniKarton koja ima:
//			ime i prezime studenta 
//			broj indeksa 
//			naziv predmeta
//			ime i prezime profesora
//			ocenu - od 5 do 10
//			gettere i settere
//			konstruktore
//			metodu koja vraca da li je ispit polozen ili ne 
//			(ispit je polozen ako je ocena veca od 5)
//			metodu stampaj koja stampa podatke u formatu:
//			        (naziv predmeta) - (ocena)
//			        Student: ime i prezime, broj indeksa
//			        Profesor: ime i prezime
//
//			    U glavnoj klasi:
//			kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//			(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita
		
		ArrayList<ZeleniKarton>ispiti = new ArrayList<ZeleniKarton>();
		
		ZeleniKarton a = new ZeleniKarton("Zdravko Colic", "mb-234", "Fizika", "Mile Kitic", 8);
		ZeleniKarton b = new ZeleniKarton("Pera Djokic", "mv-234", "Hemija", "Mica Tatic", 5);
		ZeleniKarton c = new ZeleniKarton("Luka Jovic", "bh-123", "Matematika", "Kosta Vulic", 7);
		ZeleniKarton d = new ZeleniKarton("Pera Spuzic", "bg-234", "Matematika", "Kosta Vulic", 7);
		ZeleniKarton e = new ZeleniKarton("Milena lukic", "bh-234", "Matematika", "Kosta Vulic", 5);
		ZeleniKarton f = new ZeleniKarton("Rade Maric", "bh-567", "Matematika", "Kosta Vulic", 9);
		ZeleniKarton g = new ZeleniKarton("Mika Marcetic", "vg-876", "Matematika", "Kosta Vulic", 9);
		ZeleniKarton h = new ZeleniKarton("Maja Manic", "bh-098", "Matematika", "Kosta Vulic", 5);
		ZeleniKarton j = new ZeleniKarton("Mara Pilic", "bh-987", "Matematika", "Kosta Vulic", 10);
		ZeleniKarton k = new ZeleniKarton("Zana Zaric", "bh-876", "Matematika", "Kosta Vulic", 5);

		
		ispiti.add(a);
		ispiti.add(b);
		ispiti.add(c);
		ispiti.add(d);
		ispiti.add(e);
		ispiti.add(f);
		ispiti.add(g);
		ispiti.add(h);
		ispiti.add(j);
		ispiti.add(k);
		
		for (int i = 0; i < ispiti.size(); i++) {
			ispiti.get(i).stampaj();
			System.out.println();
		}

		
		


	}

}
