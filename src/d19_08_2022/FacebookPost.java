package d19_08_2022;

public class FacebookPost {
//		Od atributa:
//		ime i prezime korisnika koji je objavio post
//		ime i prezime korisnika na kom je profilu objavljen post 
//		(posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//		tekst objave
//		broj lajkova
//		broj deljenja
//		Konstruktore:
//		difoltni konstuktor
//		konstuktor koji postavlja ime i prezime korisnika ko je objavio, 
//		korisnika na kom je profilu objavnljen i tekst objave
//		Od metoda:
//		like(), koja povecava broj lajkova za 1.
//		dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//		share(), koja povecava broj deljenja za 1
//		print(), koja stampa objavu u formatu:
//		(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//		(tekst objave)
//		Likes (broj lajkova) | Shares (broj deljenja)


	private String fullNameSharer;
	private String fullNameOwner;
	private String text;
	private int likes;
	private int shares;
	
	public void SetFullNameSharer(String fullNameSharer) {
		this.fullNameSharer = fullNameSharer;
	}
	
	public void SetFullNameOwner(String fullNameOwner) {
		this.fullNameOwner = fullNameOwner;
	}
	
	public void SetText(String text) {
		this.text = text;
	}
	
	public void SetLikes(int likes) {
		this.likes = likes;
	}
	
	public void SetShares(int shares) {
		this.shares = shares;
	}

	public FacebookPost() {

	}

	public FacebookPost(String sh, String o, String t) {
		this.fullNameSharer = sh;
		this.fullNameOwner = o;
		this.text = t;
	}

	public void like() {
		this.likes = this.likes + 1;
	}

	public void dislike() {
		this.likes = this.likes - 1;
		if (this.likes < 0) {
			this.likes = 0;
		}
	}

	public void share() {
		this.shares++;
	}

	public void print() {
		System.out.println(this.fullNameSharer + " >>> " + this.fullNameOwner);
		System.out.println(this.text);
		System.out.println("Likes " + this.likes + " | " + "Shares " + this.shares);
		System.out.println();
	}

}
