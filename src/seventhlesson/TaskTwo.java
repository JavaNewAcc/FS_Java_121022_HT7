package seventhlesson;

import java.util.Scanner;

public class TaskTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть висоту прямокутника:");
		int height = scan.nextInt();
		while (!checkSideLength(height, 1)) {
			System.out.println("Висота не може бути менше 2. Введіть нове значення:");
			height = scan.nextInt();
		}

		System.out.println("Введіть ширину прямокутника:");
		int width = scan.nextInt();
		while (!checkSideLength(width, 1)) {
			System.out.println("Висота не може бути менше 2. Введіть нове значення:");
			width = scan.nextInt();
		}

		printRectangle(height, width);
	}

	/**
	 * Checks if given value does not exceed the limit
	 * 
	 * @param value - value that is compared to limit value
	 * @param limit - limit determined by used
	 * @return true if value exceeds limit and false if value is below limit
	 * @author Anton B.
	 */
	public static boolean checkSideLength(int value, int limit) {
		if (value > limit) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Prints rectangle with given height and width using "*" marks.
	 * 
	 * @param height - integer value of height of rectangle which will be printed
	 * @param width  - integer value of width of rectangle which will be printed
	 * @author Anton B.
	 */
	public static void printRectangle(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height) {
					System.out.print("*");
				} else {
					if (j == 1 || j == width) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
