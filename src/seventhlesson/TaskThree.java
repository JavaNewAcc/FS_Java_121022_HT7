package seventhlesson;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 2, 5, 7, 9, 1, 0, 3, 4, 8 };
		System.out.println("Початковий масив: " + Arrays.toString(arr));

		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть число для пошуку: ");
		int value = scan.nextInt();
		if (findElement(arr, value) < 0) {
			System.out.println("Такого значення в масиві немає.");
		} else {
			System.out.println("Значення " + value + " знаходиться під індексом " + findElement(arr, value)
					+ " у заданному масиві.");
		}
	}

	/**
	 * Performs linear search of the element in the array. Does not take into
	 * account possible further repeats of the element.
	 * 
	 * @param array - array of integers that is used for search of the element
	 * @param value - value of the element which is looked for in the array
	 * @return index of the element if it has been found and -1 if there is no such
	 *         element in the given array
	 * @author Anton B.
	 */

	public static int findElement(int[] array, int value) {
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				index = i;
				break;
			}
		}
		return index;
	}
}