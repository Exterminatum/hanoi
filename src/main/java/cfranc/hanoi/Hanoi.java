package cfranc.hanoi;

public class Hanoi {
	
	Tour tourInit;
	Tour tourInter;
	Tour tourDest;

	public Hanoi(int n){
		tourInit = new Tour(n);
		tourInter = new Tour(n);
		tourDest = new Tour(n);
		for (int i = n; i > 0; i--) {
		Disque disquecourant= new Disque(i);
		tourInit.empiler(disquecourant);
		}
		System.out.println(tourInit.taille() + " TAILLE");
		
	}

	
	public Hanoi(){
		tourInit = new Tour();
		tourInter = new Tour();
		tourDest = new Tour();
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		tourInit.empiler(grand);
		tourInit.empiler(moyen);
		tourInit.empiler(petit);
	}
	
	public void bougerSommet(Tour from, Tour to) {
	System.out.println("Taille de pile :  "+ from.taille());
	Disque d = from.depiler();
	
	to.empiler(d);

	
	}

	public void deplacer(int nbDisque, Tour from, Tour to, Tour by){

		if (nbDisque == 1) {
			bougerSommet(from, to);
		}
	
		if (nbDisque > 1) {
			deplacer(nbDisque-1, from, by, to);
			bougerSommet(from, to);
			deplacer(nbDisque-1, by, to, from);
		
		}

		
	}
	

	public void jouer() {
		deplacer(tourInit.taille(), tourInit, tourDest, tourInter);
	}

	public static void main(String[] args) {
		// Compléter la classe Hanoi pour résoudre le jeux avec 3 disques :
		Hanoi game = new Hanoi(10);
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourDest.estVide());
		System.out.println(game.tourInter.estVide());
		System.out.println(game.tourInit.taille());
		game.jouer();
		System.out.println(game.tourInit.estVide());
		System.out.println(game.tourInter.estVide() + " " + game.tourInter.taille());
		System.out.println(game.tourDest.estVide() + " " + game.tourDest.disques.size());
		
	}

}