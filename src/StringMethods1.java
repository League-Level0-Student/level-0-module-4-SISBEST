//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class StringMethods1 {
	public static void main(String[] args) {
		String TheKeyToLife = "The Key To Life Is To Not Kill Anyone.";

		System.out.println(TheKeyToLife.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops
		for (int times = 0; times<TheKeyToLife.length();times++) {
			System.out.println(TheKeyToLife.charAt(times));
		}
		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


