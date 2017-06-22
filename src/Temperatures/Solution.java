package Temperatures;

import java.util.Scanner;

class Solution {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); // the number of temperatures to analyse
		in.nextLine();
		Integer result = null;
		int zero = 0;
		String temps = in.nextLine(); // the n temperatures expressed as
										// integers ranging from -273 to 5526

		// Write an action using System.out.println()
		// To debug: System.err.println("Debug messages...");

		if (n > zero) {
			for (String tem : temps.split(" ")) {
				int temperature = Integer.parseInt(tem);

				if ((result == null) || (Math.abs(temperature) < Math.abs(result))) {
					result = temperature;

				} else if (Math.abs(result) == Math.abs(temperature)) {
					if ((result < 0) && (temperature > 0)) {
						result = temperature;
					}
				}

			}
		}
		System.out.println((result == null) ? 0 : result);
	}
}