import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		String LorR = JOptionPane.showInputDialog(null, "You are in a forest. Left or right? (Type L or R)");
		if (LorR.equals("L")) 
			System.out.println("You Die!");
		if (LorR.equals("R")) 
			System.out.println("You win!");
	}

}