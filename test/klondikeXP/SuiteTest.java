package klondikeXP;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class SuiteTest {
	
	@Test
	public void testFind() {
		assertEquals(Suite.find('h'), Suite.HEARTS);
	}
	
	@Test
	public void testInitials() {
		assertArrayEquals(Suite.initials(), new char[]{'h','d','c','p'});
	}

	
}
