package seventhlesson;

import java.util.Scanner;

public class AddTaskOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean stringCheckRes = false;
		String inputString = "";

		while (!stringCheckRes) {
			System.out.println("Введіть послідовність чисел через кому чи крапку:");
			inputString = scan.nextLine();
			stringCheckRes = inputChecker(inputString, '0', '9', '.', ',');
		}
		String[] stringArr = inputString.split("[.,]");

		int[] intArr = convertStringToInt(stringArr);

		if (arythmProgr(intArr) > 0) {
			System.out.println("Вказана прогресія АРИФМЕТИЧНА. Наступний елемент: " + arythmProgr(intArr));
		} else if (geometrProgr(intArr) > 0) {
			System.out.println("Вказана прогресія ГЕОМЕТРИЧНА. Наступний елемент: " + geometrProgr(intArr));
		} else if (powTwoProgr(intArr) > 0) {
			System.out.println("Вказано СТЕПЕНЕВИЙ РЯД. Наступний елемент: " + powTwoProgr(intArr));
		} else if (powThreeProgr(intArr) > 0) {
			System.out.println("Вказано СТЕПЕНЕВИЙ РЯД. Наступний елемент: " + powThreeProgr(intArr));
		} else {
			System.out.println("Вказаний набір чисел не є прогресією");
		}
	}

	/**
	 * Checks if entered String value contains only allowed char values
	 * 
	 * @param string - string which will be checked
	 * @param from   initial char value (for instance 'a')
	 * @param to     final char value (for instance 'z')
	 * @param add1   - additional parameter to check if for instance ',' has been
	 *               entered
	 * @param add2   - additional parameter to check if for instance '.' has been
	 *               entered
	 * @return <strong>true</strong> if string conforms to the requirements and
	 *         <strong>false</strong> if it doesn't conform to requirements
	 */
	public static boolean inputChecker(String string, char from, char to, char add1, char add2) {
		char[] charArr = string.toCharArray();
		boolean result = false;
		for (int i = 0; i < charArr.length; i++) {
			if ((charArr[i] >= from && charArr[i] <= to || charArr[i] == add1 || charArr[i] == add2)) {
				result = true;
			} else {
				result = false;
				System.out.println("Введіть лише числа через кому(',') або крапку ('.')");
				break;
			}
		}
		return result;
	}

	/**
	 * Transforms array of String values to array of Integer values
	 * 
	 * @param array - array of String values to be converted to Integer
	 * @return array of Integer values
	 * @author Anton B.
	 */
	public static int[] convertStringToInt(String[] array) {
		int[] intArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			intArr[i] = Integer.valueOf(array[i]);
		}
		return intArr;
	}

	public static int arythmProgr(int[] arr) {
		int dif = arr[1] - arr[0];
		int counter = 0;
		int arythmProgr = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] + dif == arr[i]) {
				counter++;
			} else {
				break;
			}
		}
		if (counter == arr.length - 1) {
			arythmProgr = arr[arr.length - 1] + dif;
		}
		return arythmProgr;
	}

	public static int geometrProgr(int[] arr) {
		int coef = arr[2] / arr[1];
		int counter = 0;
		int geomProgr = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] * coef == arr[i]) {
				counter++;
			} else
				break;
		}
		if (counter == arr.length - 1) {
			geomProgr = arr[arr.length - 1] * coef;
		}
		return geomProgr;
	}

	public static int powTwoProgr(int[] arr) {
		int counter = 0;
		int powProgr = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Math.pow(i + 1, 2)) {
				counter++;
			} else {
				break;
			}
		}
		if (counter == arr.length) {
			powProgr = (int) Math.pow(arr.length + 1, 2);
		}
		return powProgr;
	}

	public static int powThreeProgr(int[] arr) {
		int counter = 0;
		int powProgr = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Math.pow(i + 1, 3)) {
				counter++;
			} else {
				break;
			}
		}
		if (counter == arr.length) {
			powProgr = (int) Math.pow(arr.length + 1, 3);
		}
		return powProgr;
	}
}