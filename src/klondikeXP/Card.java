package klondikeXP;

public class Card {

	private Values valuesM;
	private Suite suiteM;
	private boolean facedUp;
	
	Card(Suite suite, Values values){
		this.suiteM = suite;
		this.valuesM = values;
		this.facedUp = true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (facedUp ? 1231 : 1237);
		result = prime * result + ((suiteM == null) ? 0 : suiteM.hashCode());
		result = prime * result + ((valuesM == null) ? 0 : valuesM.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (facedUp != other.facedUp)
			return false;
		if (suiteM != other.suiteM)
			return false;
		if (valuesM != other.valuesM)
			return false;
		return true;
	}

	public boolean isNextTo(Card card) {
		if(card == null)
			return false;
		else if(this.valuesM.ordinal()+1 == card.valuesM.ordinal() || this.valuesM.ordinal()-1 == card.valuesM.ordinal())
			return true;
		else
			return false;
	}
	
	public Card flip() {
		if(this.facedUp)
			this.facedUp = false;
		else
			this.facedUp = true;
		return this;
	}
	
	public boolean isFacedUp() {
		return facedUp;
	}
	
}
