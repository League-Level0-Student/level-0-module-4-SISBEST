import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String Pet = JOptionPane.showInputDialog(null, "What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int timeGiven = 0; timeGiven < 50; timeGiven++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to your pet?", "Pet Option", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water" }, null);
			if (task == 0) {
				Cuddle();
			}
			if (task == 1) {
				Food();
			}
			if (task == 2) {
				Water();
			}
			if (happinessLevel > 50) {
				JOptionPane.showMessageDialog(null, "Your pet " + Pet + " is finally happy! You win!");
				System.exit(0);
			}
		}

	}

	static void Cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet loves you too! +1 happiness.");
		happinessLevel++;
	}
	static void Food() {
		JOptionPane.showMessageDialog(null, "Your pet ate a huge meal! +5 happiness.");
		happinessLevel = happinessLevel + 5;
	}
	static void Water() {
		JOptionPane.showMessageDialog(null, "Your pet drank a lot! +1 happiness.");
		happinessLevel++;
	}
}