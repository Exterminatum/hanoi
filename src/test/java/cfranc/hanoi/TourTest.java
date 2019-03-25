package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {
Tour tower = new Tour();
Disque dSmall = new Disque(1);
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

	
}
