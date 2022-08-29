package d25_08_2022;

import java.util.ArrayList;

public class Student {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private String brIndeksa;
	private String punoImeStudent;
	private String tipStudija;

	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brIndeksa, String punoImeStudent, String tipStudija) {
		super();
		this.brIndeksa = brIndeksa;
		this.punoImeStudent = punoImeStudent;
		this.tipStudija = tipStudija;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}

	public String getPunoImeStudent() {
		return punoImeStudent;
	}

	public void setPunoImeStudent(String punoImeStudent) {
		this.punoImeStudent = punoImeStudent;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)

	private double racunajProsek() {
		double prosek = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if (this.ispiti.get(i).polozio() == true) {
				prosek += this.ispiti.get(i).getOcena();
			}

		}
		return prosek / this.ispiti.size();
	}

	public void stampaj() {
		System.out.println(this.brIndeksa + " " + this.punoImeStudent + " " + this.tipStudija);

		for (int i = 0; i < this.ispiti.size(); i++) {
			System.out.println("Predmet: ");
			this.ispiti.get(i).stampaj();

		}
		System.out.println("Prosecna ocena je: " + this.racunajProsek());
	}

}
