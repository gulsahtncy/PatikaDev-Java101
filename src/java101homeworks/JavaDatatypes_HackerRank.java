package java101homeworks;

import java.util.Scanner;

public class JavaDatatypes_HackerRank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = input.nextInt();
		for (int i = 0; i < count; i++) {

			try {
				boolean checker = false;
				String message = "";
				long x = input.nextLong();

				if (x >= -128 && x <= 127) {
					checker = true;
					message = "* byte\n";
					System.out.println(x + " can be fitted in:");
					System.out.println(message);
					continue;
				}

				if (x >= -32768 && x <= 32767) {
					checker = true;
					message = "* short\n" + "* int\n" + "* long";
					System.out.println(x + " can be fitted in:");
					System.out.println(message);
					continue;
				}

				if (x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31) - 1)) {
					checker = true;
					message = "* int\n" + "* long";
					System.out.println(x + " can be fitted in:");
					System.out.println(message);
					continue;
				}

				if (x >= Math.pow(-2, 63) && x <= (Math.pow(2, 63) - 1)) {
					checker = true;
					message = "* long";
					System.out.println(x + " can be fitted in:");
					System.out.println(message);
					continue;
				}
			} catch (Exception e) {
				System.out.println(input.next() + " can't be fitted anywhere.");
			}

		}
	}
}
