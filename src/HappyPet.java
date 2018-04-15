import javax.swing.JOptionPane;

public class HappyPet {
	static int happinessLevel = 0;
	public static void main(String[] args) {
		String Pet = JOptionPane.showInputDialog(null, "What pet do you want to buy?");
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
