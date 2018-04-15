import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	public static void main(String[] args) {
		int score = 0;
		JOptionPane.showMessageDialog(null, "We are going to play NameThatTune. I will play a song, and you will have to guess it. Inital Caps on each word, please!");
		playSound("Good Kid.wav");
		String guess = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess.equals("Good Kid")) {
			JOptionPane.showMessageDialog(null,"Correct! What about this?");
			playSound("correct.wav");
			score++;
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was Good Kid!");
			playSound("wrong.wav");
		}
		playSound("goatherd.wav");
		String guess2 = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess2.equals("The Lonely Goatherd")) {
			JOptionPane.showMessageDialog(null,"Correct! What about this?");
			playSound("correct.wav");
			score++;
		}
		else {
			playSound("wrong.wav");
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was The Lonely Goatherd!");
		}
		playSound("Drive.wav");
		String guess3 = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess3.equals("Drive")) {
			JOptionPane.showMessageDialog(null,"Correct! What about this?");
			playSound("correct.wav");
			score++;
		}
		else {
			playSound("wrong.wav");
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was Drive!");
		}
		playSound("salzburgmontage.wav");
		String guess4 = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess4.equals("My Favorite Things")) {
			JOptionPane.showMessageDialog(null,"Correct! What about this?");
			playSound("correct.wav");
			score++;
		}
		else {
			playSound("wrong.wav");
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was My Favorite Things!");
		}
		playSound("Bring On The Monsters.wav");
		String guess5 = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess5.equals("Bring On The Monsters")) {
			JOptionPane.showMessageDialog(null,"Correct! What about this?");
			playSound("correct.wav");
			score++;
		}
		else {
			playSound("wrong.wav");
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was Bring On The Monsters!");
		}
		playSound("GettingToKnowYou.wav");
		String guess6 = JOptionPane.showInputDialog(null, "What's your guess?");
		if (guess6.equals("Getting To Know You")) {
			JOptionPane.showMessageDialog(null,"Correct! Click OK to view your score!");
			playSound("correct.wav");
			score++;
		}
		else {
			playSound("wrong.wav");
			JOptionPane.showMessageDialog(null, "Sorry! Not correct! The answer was Getting To Know You!");
		}
		JOptionPane.showMessageDialog(null, "Your score was " + score + "/6! Thanks for playing Samuel and Gigi's NameTheTune!");
		JOptionPane.showMessageDialog(null, "Come back soon!");
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
