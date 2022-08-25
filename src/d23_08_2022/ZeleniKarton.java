package d23_08_2022;

public class ZeleniKarton {
//	Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//		        (naziv predmeta) - (ocena)
//		        Student: ime i prezime, broj indeksa
//		        Profesor: ime i prezime
	
	private String studentPunoIme;
	private String brojIndeksa;
	private String predmet;
	private String profesorPunoIme;
	private int ocena;
	
	public ZeleniKarton(String studentPunoIme, String brojIndeksa, 
			String predmet, String profesorPunoIme, int ocena) {
		super();
		this.studentPunoIme = studentPunoIme;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.profesorPunoIme = profesorPunoIme;
		this.ocena = ocena;	
	}

	public String getStudentPunoIme() {
		return studentPunoIme;
	}

	public void setStudentPunoIme(String studentPunoIme) {
		this.studentPunoIme = studentPunoIme;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getProfesorPunoIme() {
		return profesorPunoIme;
	}

	public void setProfesorPunoIme(String profesorPunoIme) {
		this.profesorPunoIme = profesorPunoIme;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	
//	metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//	metodu stampaj koja stampa podatke u formatu:
//	        (naziv predmeta) - (ocena)
//	        Student: ime i prezime, broj indeksa
//	        Profesor: ime i prezime
	
	public boolean polozio() {
		if (this.ocena > 5) {
			return true;
		}return false;
	}
	
	public void stampaj() {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.studentPunoIme + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.profesorPunoIme);
	}
	
	


}
