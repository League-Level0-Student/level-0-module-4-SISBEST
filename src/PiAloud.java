import java.io.IOException;
import java.util.Scanner;

public class PiAloud {

	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		String Pi = "3.14159265359";
		for (int i = 0; i<Pi.length();i++) {
			char UserInput = getInputFromUser();
			if (UserInput==Pi.charAt(i)) {
				speak(Pi.charAt(i)+"");
		}
		}
	}
	static void speak(String d) {
		try {
			Runtime.getRuntime().exec("say " + d).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


	static char getInputFromUser() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next().toCharArray()[0];
	}

}


