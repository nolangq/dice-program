// Nolan Quinn, 5655015, Assignment 2, Uses die and dice class to roll dice 1000 times
// then prints the data.
package assignment2;

public class Quinn_Nolan {
	public static void main(String[] args) {
		// Create pair of dice
		Dice pair = new Dice();
		// Create array to collect values 
		int[] rolls = new int[] {0,0,0,0,0,0,0,0,0,0,0};
		// Loop 1000 times and store values
		for (int i = 0; i < 1000; i++) {
			pair.roll();
			rolls[pair.getFaceValue() - 2]++;
		}
		// Print all the rolls
		for (int i = 0; i < rolls.length; i++) {
			System.out.println("Number of "+(i+2) +"s are "+ rolls[i]);
		}
		// Print histogram that shows the roll data
		int yAxis = 175;
		System.out.println("Graph");
		while (yAxis >= 0) {
			if (yAxis < 100 && yAxis > 0) {
				System.out.print(" ");
			} else if (yAxis == 0) {
				System.out.print("  ");
			}
			System.out.print(yAxis + "|");
			for (int i = 0; i < rolls.length; i++) {
				if (rolls[i] >= yAxis) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.print("\n");
			yAxis -= 25;
		}
		System.out.println("    ---------------------------------");
		System.out.println("     2  3  4  5  6  7  8  9 10 11 12");
	}
}
