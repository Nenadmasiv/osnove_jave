package d09_05_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, 
//			postaviti sektore u kojima rade i ispisati platu za svakog
		
		Radnik steva = new Magacioner("Steva Panic");
//		Sektor s1 = new Sektor("Prodaja", 45000);
		steva.zaposliUSektor(new Sektor("Prodaja", 45000));
		steva.zaposliUSektor(new Sektor("Nabavka", 35000));
		steva.zaposliUSektor(new Sektor("F&B", 37000));
		steva.zaposliUSektor(new Sektor("Restorana", 46000));
		steva.zaposliUSektor(new Sektor("Recepcije", 39000));
	
		steva.zaposliUSektor(new Sektor("Radnik", 35000));
		
		for (int i = 0; i < steva.sektori.size(); i++) {
			System.out.println(steva.sektori.get(i).getNazivSektora()
					+ ", " + steva.sektori.get(i).getPlata());
		}
		
//		steva.plata();
		System.out.println(steva.plata());


	}

}
