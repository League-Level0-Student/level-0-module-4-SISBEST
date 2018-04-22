public class StringMethods1 {
	public static void main(String[] args) {
		String TheKeyToLife = "The first is the fourth, a dissapointing mark. You'll find it in parked, but not in park.";
		System.out.println("The " + TheKeyToLife.length() + "-letter Mystery Message Of The Day Is:");
		for (int times = 0; times < TheKeyToLife.length(); times++) {
			System.out.println(TheKeyToLife.charAt(times));
		}
		for (int times = 0; times < TheKeyToLife.length(); times++) {
			if (TheKeyToLife.charAt(times) == 'm') {
				System.out.println("The position for the Mystery Letter is " + times + "!");
			}
		}
	}
}
