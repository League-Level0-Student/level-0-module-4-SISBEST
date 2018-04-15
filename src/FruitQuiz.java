
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import java.applet.AudioClip;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FruitQuiz extends KeyAdapter {

	void makeQuestions() {
		question1 = new JLabel(
				"<html>Which is not a real fruit? <br> A: Dragon Fruit <br> B: Durian <br> C: Crazyberry</html>");
		question2 = new JLabel(
				"<html>What color is an apple? <br> A: Red <br> B: Green <br> C: Yellow <br> D: Can be any of the above!</html>");
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		int keyCode = arg0.getKeyCode();
		// 1. Print out the key code variable
		System.out.println(keyCode);
		// 2. Make 3 int variables that hold the key codes for A, b, and C
		int a = 65;
		int b = 66;
		int c = 67;
		int d = 68;
		// 12. If question2 is showing,

		// 13. check if it is right or wrong like you did for question1

		if (question1.isShowing()) {
			// 3. If they selected the right fruit, do steps 4 and 7
			if (keyCode == c) {
				correct();
				nextQuestion(question2);
			}

			else {
				incorrect();
			}
		}
		if (question2.isShowing()) {
			if (keyCode == d) {
				correct();
			} else {
				incorrect();
			}
		}

	}

	private void correct() {
		playSound("423930__mudkip2016__correct.wav");

	}

	private void incorrect() {
		playSound("351563__bertrof__game-sound-incorrect-with-delay.wav");

	}

	private void nextQuestion(JLabel newQuestion) {
		frame.remove(question1);
		frame.remove(question2);
		frame.remove(question3);
		frame.remove(question4);
		frame.add(newQuestion);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	public static void main(String[] args) {
		new FruitQuiz().go();
	}

	JFrame frame = new JFrame();

	private void go() {
		makeQuestions();
		frame.add(question1);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
	}

	JLabel question1 = new JLabel(), question2 = new JLabel(), question3 = new JLabel(), question4 = new JLabel(),
			question5;
}
