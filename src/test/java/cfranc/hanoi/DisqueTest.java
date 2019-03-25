package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
Disque dSmall = new Disque(1);
Disque dSmall2 = new Disque(1);
Disque dMedium = new Disque(2);

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
	}
	@Test
	public void compareTo_SmallMedium_Negative() {
		int expected = -1;
				int actual = dSmall.compareTo(dMedium);
				assertEquals(expected, actual);
	}
	@Test
	public void compareTo_SmallMedium_Positive() {
		int expected = 1;
				int actual = dMedium.compareTo(dSmall);
				assertEquals(expected, actual);
	}
	
	@Test
	public void compareTo_SmallSmall_Equal() {
		int expected = 0;
				int actual = dSmall.compareTo(dSmall2);
				assertEquals(expected, actual);
	}
	
}
