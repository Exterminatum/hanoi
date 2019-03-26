package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
Tour tower = new Tour();
Disque dSmall = new Disque(1);
Disque dMedium = new Disque(2);
Disque dLarge = new Disque(3);
	@Test
	public void test() {
		
		
	}
	@Test
	public void Empile_EmptyTower_Disque() {
	Disque d;
	int expectedsize = 1;
	tower.empiler(dSmall);
	d = tower.sommet();
	assertEquals(tower.taille(), expectedsize);
	assertEquals(d, dSmall);	
	}
	
	@Test
	public void Depile_FullTower_Disque() {
	Disque d;
	int expectedsize = 0;
	tower.empiler(dSmall);
	d = tower.depiler();
	assertEquals(d, dSmall);
	assertEquals(tower.taille(), expectedsize);	
	}
	
	@Test
	public void Diameter_TwoDisc_One() {
	
	int expectedsize = 1;
	tower.empiler(dMedium);
	tower.empiler(dSmall);
	
	assertEquals(expectedsize, tower.diam());
	
	}
	
	@Test
	public void EstPleine_FullTower_Positive() {
	
	
	tower.empiler(dLarge);
	tower.empiler(dMedium);
	tower.empiler(dSmall);
	
	assertTrue(tower.estPleine());
	
	}
	@Test
	public void EstPleine_EmptyTower_Negative() {
	
	
	assertFalse(tower.estPleine());
	
	}
	
	@Test
	public void Empiler_WrontTower_Negative() {
		tower.empiler(dSmall);
		
	assertFalse(tower.empiler(dLarge));
	
	}
	
}
