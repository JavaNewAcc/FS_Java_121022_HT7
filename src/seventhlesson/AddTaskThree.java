package seventhlesson;

import java.util.Arrays;
import java.util.Scanner;

public class AddTaskThree {

	public static void main(String[] args) {
		boolean acceptableLength = false;
		int length = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть довжину масива:");

		while (!acceptableLength) {
			length = scan.nextInt();
			acceptableLength = inputChecker(length, 0);
		}
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		System.out.println("Початковий масив: " + Arrays.toString(array));
		System.out.println("Можливі перестановки:");

		int indexOne = findFirstMoveElement(array);
		System.out.println(indexOne);
		int indexTwo = findSecondMoveElement(indexOne, array);
		System.out.println(indexTwo);

		while (indexOne > indexTwo) {

		}
	}

	/**
	 * Checks if entered Int value is above limit
	 * 
	 * @param value - integer value which will be compared to limit;
	 * @param limit - integer value of the limit used to compare value;
	 * @return <strong>true</strong> if value is above the limit and
	 *         <strong>false</strong> if value is below or equal to limit
	 */
	public static boolean inputChecker(int value, int limit) {
		boolean result = false;
		if (value > limit) {
			result = true;
		} else {
			System.out.println("Спробуйте ще раз. Введіть ціле число більше 0");
		}
		return result;
	}

	public static int findFirstMoveElement(int[] array) {
		int indexFirst = -1;
		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > array[i - 1]) {
				indexFirst = i - 1;
				break;
			}
		}
		return indexFirst;
	}

	public static int findSecondMoveElement(int index, int[] array) {
		int indexSecond = -1;
		for (int i = array.length - 1; i > index; i--) {
			if (array[i] > array[index]) {
				indexSecond = i;
				break;
			}
		}
		return indexSecond;
	}

	public static int[] revisedArray(int[] array, int indexFirst, int indexSecond) {
		int tempElement = array[indexFirst];
		array[indexFirst] = array[indexSecond];
		array[indexSecond] = tempElement;
		return array;
	}

	public static int[] reverseElements(int[] array, int index) {
		int loopLength = (array.length - 1 - index) / 2;
		for (int i = index + 1; i < array.length - loopLength; i++) {
			int tempElement = array[i];
			array[i] = array[array.length - i];
			array[array.length - i] = tempElement;
		}
		return array;
	}
}