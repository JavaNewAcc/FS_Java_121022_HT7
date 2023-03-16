package seventhlesson;

public class ClassworkOne {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = calcEvenSum(array);
		System.out.println("Total sum of even array elements is: " + sum);
	}

	public static int calcEvenSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		return sum;
	}
}