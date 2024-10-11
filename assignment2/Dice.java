package assignment2;

public class Dice {
	// Create Die variables
	private Die die1;
	private Die die2;
	// Constructor
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}
	// Getter
	public int getFaceValue() {
		return die1.getFaceValue() + die2.getFaceValue();
	}
	// Roll both dice
	public void roll() {
		die1.roll();
		die2.roll();
	}
}
