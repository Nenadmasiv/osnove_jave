package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
//	Kreirati klasu XandOGame koja ima:
//	table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//	nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//	playerX - igrac X
//	playerO - igrac O
//	Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//	Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi 
//	i difoltni samo sto dodatno postavlja i igraca
//	gettere i settere za igrace
//	Metodu print koja stampa tablu sliku kao na slici. 
//	Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//	x | x | 0 |
//	0 | x | 0 |
//	x | 0 | x |
	
	ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerY;

	public XandOGame() {
		super();
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}

	public XandOGame(Player playerX, Player playerY) {
		super();
		this.playerX = playerX;
		this.playerY = playerY;
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}
	
	public String getNextPlayer() {
		return nextPlayer;
	}

	public void setNextPlayer(String nextPlayer) {
		this.nextPlayer = nextPlayer;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerY() {
		return playerY;
	}

	public void setPlayerY(Player playerY) {
		this.playerY = playerY;
	}

	public void printTable() {
		for (int i = 0; i < table.size(); i++) {
			if ((i + 1) % 3 != 0 || i == 0) {
				System.out.print(table.get(i) + "|");
			} else {
				System.out.println(table.get(i) + "|");
			}

		}
	}

//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ 
//	i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. 
//	Metoda od parametara prima niz i poziciju za kojju se proverava. 
//	Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, 
//	ako je bio igrac x prebacuje ga na o i obrnuto

	public void startGame() {
		table.set(0, " ");
		table.set(1, " ");
		table.set(2, " ");
		table.set(3, " ");
		table.set(4, " ");
		table.set(5, " ");
		table.set(6, " ");
		table.set(7, " ");
		table.set(8, " ");
//		System.out.println("Igrac " + this.playerX.getPunoIme() + " je na potezu.");
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		if(!this.isWinnerO() && !this.isWinnerX()) {
		for (int i = 0; i < table.size(); i++) {
			if (table.get(i).equals(" ")) {
				return false;
			}
		}
		}
		return true;
	}

	public boolean isFieldFree(int pozicija) {
		if (table.get(pozicija).equals(" ")) {
			return true;
		}
		System.out.println("Ovo polje je popunjeno. Pokusajte ponovo");
		return false;
	}
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, 
//	ako je bio igrac x prebacuje ga na o i obrnuto
	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "0";
		} else if (this.nextPlayer.equals("0")) {
			this.nextPlayer = "x";
		} 
//		else {
//			System.out.println("Invalid move!");
//		}
	}

//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x
//	x | x | 0 |
//	0 |   |   |
//	x |   |   |
//	I pozove se metoda makeAMove za poziciju 5, novo stanje u igri je 
//	x | x | 0 |
//	0 |   | x |
//	x |   |   |

	public void makeAMove(int pozicija) {
		if (this.isValidMove(pozicija)) {
			if (this.isFieldFree(pozicija)) {
				this.table.set(pozicija, nextPlayer);
				this.playNext();
			}
		}
		
	}

//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. 
//	Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka 
//	ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. 
//	Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka 
//	ili po koloni ili po redu ili po dijgonalama

	public boolean isWinnerX() {
		if (table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")
				|| table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")
				|| table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")
				|| table.get(1).equals("x") && table.get(4).equals("x") && table.get(7).equals("x")
				|| table.get(2).equals("x") && table.get(5).equals("x") && table.get(8).equals("x")
				|| table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")
				|| table.get(6).equals("x") && table.get(4).equals("x") && table.get(2).equals("x")) {
			return true;
		}
		return false;
	}

	public boolean isWinnerO() {
		if (table.get(0).equals("0") && table.get(1).equals("0") && table.get(2).equals("0")
				|| table.get(3).equals("0") && table.get(4).equals("0") && table.get(5).equals("0")
				|| table.get(6).equals("0") && table.get(7).equals("0") && table.get(8).equals("0")
				|| table.get(1).equals("0") && table.get(4).equals("0") && table.get(7).equals("0")
				|| table.get(2).equals("0") && table.get(5).equals("0") && table.get(8).equals("0")
				|| table.get(0).equals("0") && table.get(4).equals("0") && table.get(8).equals("0")
				|| table.get(6).equals("0") && table.get(4).equals("0") && table.get(2).equals("0")) {
			return true;
		}
		return false;
	}

//	Metodu isValidMove koja vraca informaciju da li je pozicija 
//	na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	public boolean isValidMove(int pozicija) {
		if (pozicija < 0 || pozicija > table.size()-1) {
			System.out.println("Ova pozicija nije u opsegu dozvoljenih. Pokusajte ponovo.");
			return false;
		}
		return true;
	}

	public int gameScore() {
		if (this.isWinnerX()) {
			return 1;
		} else if (this.isWinnerO()) {
			return 2;
		}
		return 0;
	}

}
