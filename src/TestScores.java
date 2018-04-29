import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String Score = JOptionPane.showInputDialog(null, "What was your last test score?");
	double score = Double.parseDouble(Score);
	if (score > 90) {
		JOptionPane.showMessageDialog(null, "Nice Job!");
	}
	else if (score < 90) {
		if (score > 84.9999) {
			JOptionPane.showMessageDialog(null, "You can do better. Still, not bad.");
		}
		else {
			JOptionPane.showMessageDialog(null, "NO WAY! GO TO YOUR ROOM! NO MEALS FOR A WEEK! I DO NOT ACCEPT BAD TEST SCORES!");
		}
	}
}
}
