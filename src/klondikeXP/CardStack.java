package klondikeXP;

import java.util.Stack;

public abstract class CardStack {
	
  protected Stack<Card> cards;
  
  CardStack(){};
  
  public boolean empty() {
    return false;
  }
  
  public Card peek() {
    return null;
  }

  public Card pop() {
    return null;
  }
  
  public void push(Card card) {}
}