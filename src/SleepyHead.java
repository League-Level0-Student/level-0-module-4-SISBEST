import javax.swing.JOptionPane;

public class SleepyHead {
	public static void main(String[] args) {
		boolean isWeekday, isVacation;
		/*
		 * Ask the user for these values using JOptionPane.showConfirmDialog(null,
		 * "is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		 */
		int Weekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "", JOptionPane.YES_NO_OPTION);
		int Vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation?", "", JOptionPane.YES_NO_OPTION);
		if (Weekday == 0) {
			isWeekday = true;
		} else {
			isWeekday = false;
		}
		if (Vacation == 0) {
			isVacation = true;
		} else {
			isVacation = false;
		}
		if (isWeekday == true) {
			if (isVacation == false) {
				JOptionPane.showMessageDialog(null, "GET UP, LAZYBONES!");
			} else {
				JOptionPane.showMessageDialog(null, "You can sleep in today.");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You can sleep in today.");
		}
		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday, print
		 * “get up lazybones!” If it is a weekday, and we are on vacation, print “sleep
		 * in”.
		 */
	}
}