package d16_08_2022;

public class Domaci1 {

	public static void main(String[] args) {
//		Napisati klasu Proizvod koja ima atribute
//		naziv proizvoda (String)
//		cenu proizvoda (double)
//		težinu proizvoda u gramima. (double)
//		    i metode:
//		stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		konvertuj - metoda konvertuje tezinu u kilograme i tone. 
//		Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, 
//		a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
//		Primer: 
//			ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//		Primer: 
//			ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
		
		Proizvod artikal1 = new Proizvod();
		artikal1.naziv = "So";
		artikal1.cena = 1300;
		artikal1.tezinaGrami = 1200;
		
		Proizvod artikal2 = new Proizvod();
		artikal2.naziv = "Secer";
		artikal2.cena = 1300;
		artikal2.tezinaGrami = 1500;
		
		artikal1.Stampaj();
		System.out.println(artikal1.kg(1200));
		artikal2.Stampaj();
		System.out.println(artikal2.t(1500));
		
//		System.out.println(artikal1.konvertuj(kg));
		
//		if(artikal1.konvertuj(kg)))
		
		

	
	}

}
