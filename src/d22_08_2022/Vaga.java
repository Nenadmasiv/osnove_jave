package d22_08_2022;

public class Vaga {
//    Kreirati klasu Vaga koja ima:
//merna jedinica (kg ili lb)
//proizvod (proizvod koji se meri)
//TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//default-ni konstuktor
//getteri i setteri za sve atribute
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). 
//	Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//               (sifra) - (naziv)
//   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//   Ukupno: (ukupna cena)  

	public String mernaJedinica;
	public Proizvod proizvod;

	public Vaga() {
		super();
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
//metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). 
//	Na racunanje cene utice i merna jedinica na koju je vaga podesena. 

	public double sracunajCenu(int tezina) {
		if (this.mernaJedinica.equals("kg")) {
			return this.getProizvod().getCenaKg()*tezina;
		} else if (this.mernaJedinica.equals("lb")) {
			return this.getProizvod().getCenaLb()*tezina;
		}
		return 0;
	}

//	metodu stampaj koja stampa racun u formatu. 
//	POMOC: trebace vam tezina kao parametar u ovoj metodi
//    (sifra) - (naziv)
//	(cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//	Ukupno: (ukupna cena)  
	
	public void print(int tezina) {
		this.getProizvod().print();
		
		System.out.println("Ukupno: " + this.sracunajCenu(tezina));
	}

}
