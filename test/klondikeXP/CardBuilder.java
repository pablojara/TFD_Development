package klondikeXP;

public class CardBuilder {
	
	private Values valuesM;
	private Suite suiteM;
	private boolean facedUp;
	
	CardBuilder(){
		this.valuesM = Values.ACE;
		this.suiteM = Suite.DIAMONDS;
		facedUp = true;
	}
	
	public CardBuilder values(Values value) {
		this.valuesM = value;
		return this;
	}
	
	public CardBuilder suite(Suite suite) {
		this.suiteM = suite;
		return this;
	}
	
	public CardBuilder facedUp(boolean faceUp) {
		this.facedUp = faceUp;
		return this;
	}
	
	Card build() {
		Card card = new Card(suiteM, valuesM);
		if(!this.facedUp)
			card.flip();
		return card;
	}

}
