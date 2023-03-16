package seventhlesson;

import java.util.Random;
import java.util.Arrays;

public class TaskOne {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] values = new int[10];

		for (int i = 0; i < values.length; i++) {
			values[i] = rand.nextInt(-100, 100);
		}
		System.out.println("Початковий масив данних: " + Arrays.toString(values));
		System.out.println("Максимальний елемент цього масива: " + findMaxValue(values));
	}

	/**
	 * Finds <strong>max</strong> value in the array of integer numbers.
	 * 
	 * @param array - array if integer numbers that is used for search of the max
	 *              value
	 * @return int value of max element found in given array
	 * @author Anton B.
	 */
	public static int findMaxValue(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maxValue < array[i]) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
}