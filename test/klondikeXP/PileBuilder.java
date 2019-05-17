package klondikeXP;

import java.util.Stack;

public class PileBuilder {
	
	private Stack<Card> cards;
	private int number;
	private int numberOfFacedUpCards;
	
	PileBuilder() {
		number = 0;
		numberOfFacedUpCards = 0;
		this.cards = new Stack<>();
	}
	
	PileBuilder cards(Stack<Card> cards) {
		this.cards = cards;
		return this;
	}
	
	PileBuilder number(int number) {
		this.number = number;
		return this;
	}
	
	PileBuilder numberOfFacedUpCards(int numberOfFacedUpCards) {
		this.numberOfFacedUpCards = numberOfFacedUpCards;
		return this;
	}
	
	Pile build() {
		return Pile(number,cards);
	}

}
