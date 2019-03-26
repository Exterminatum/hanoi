package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class HanoiTest {

	@Test
	public void Hanoi_Resolve_Resolved() {
	Hanoi game = new Hanoi();
	game.jouer();
	assertTrue(game.tourInit.estVide());
	assertTrue(game.tourInter.estVide());
	assertTrue(game.tourDest.estPleine());
	}
	@Test
	public void HanoiN_Resolve_Resolved() {
		int minimum = 3;
		int roundsNumber = 10;
		for (int i = minimum; i < roundsNumber; i++) {
	Hanoi game = new Hanoi(i);
	game.jouer();
	assertTrue(game.tourInit.estVide());
	assertTrue(game.tourInter.estVide());
	assertTrue(game.tourDest.estPleine());
	}
	}
}
