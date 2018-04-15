

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
		String numb1 = JOptionPane.showInputDialog(null, "First number?");
		String numb2 = JOptionPane.showInputDialog(null, "Second number?");
		int numb1int = Integer.parseInt(numb1);
		int numb2int = Integer.parseInt(numb2);
		int operation = JOptionPane.showOptionDialog(null, "What Operation?", "SamCalc: The Samuel Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "+", "-", "* (X)", "/ (Divide)" },
				null);
		if (operation == 0) {
			add(numb1int, numb2int);
		}
		if (operation == 1) {
			subtract(numb1int, numb2int);
		}
		if (operation == 2) {
			multiply(numb1int, numb2int);
		}
		if (operation == 3) {
			divide(numb1int, numb2int);
		}
	}
	static void add(int a,int b) {
		JOptionPane.showMessageDialog(null, a + "+" + b + "=" + (a+b) );
	}
	static void subtract(int a,int b) {
		JOptionPane.showMessageDialog(null, a + "-" + b + "=" + (a-b) );
	}
	static void multiply(int a,int b) {
		JOptionPane.showMessageDialog(null, a + "*" + b + "=" + (a*b) );
	}
	static void divide(int a,int b) {
		JOptionPane.showMessageDialog(null, a + "/" + b + "=" + (a/b) );
	}
}