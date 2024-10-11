package assignment2;
import java.util.Random;

public class Die {
	// Create faceValue variable
	private int faceValue;
	// Constructor
	public Die() {
		faceValue = 1;
	}
	// Getter
	public int getFaceValue() {
		return faceValue;
	}
	// Setter
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	// Roll for random value between 1 and 6
	public void roll() {
		Random rand = new Random();
        faceValue = rand.nextInt(6) + 1;
	}
}
