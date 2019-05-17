package klondikeXP;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardTest {
	
	@Test
	public void testIsNextTo() {
		Card card = new CardBuilder().values(Values.ACE).build();
		assertTrue(card.isNextTo(new CardBuilder().values(Values.TWO).build()));
	}
	
	@Test
	public void testIsNextToDown() {
		Card card = new CardBuilder().values(Values.FIVE).build();
		assertTrue(card.isNextTo(new CardBuilder().values(Values.FOUR).build()));
	}
	
	@Test
	public void testIsNextToFail() {
		Card card = new CardBuilder().values(Values.ACE).build();
		assertFalse(card.isNextTo(new CardBuilder().values(Values.FOUR).build()));
	}
	
	@Test
	public void testIsNextToNull() {
		Card card = new CardBuilder().values(Values.ACE).build();
		assertFalse(card.isNextTo(null));
	}
	
	@Test
	public void testFlipWhenFacedUp() {
		assertFalse(new CardBuilder().build().flip().isFacedUp());
	}
	
	@Test
	public void testFlipWhenFacedDown() {
		assertTrue(new CardBuilder().facedUp(false).build().flip().isFacedUp());
	}
}
