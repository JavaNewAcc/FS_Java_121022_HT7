package seventhlesson;

public class AddTaskTwo {

	public static void main(String[] args) {
		System.out.println("Максимальне значення паліндрому при множенні трьохзначних чисел: " + findPalindrom());
	}

	public static int findPalindrom() {
		int palindrom = 0;
		int maxPalindrom = 0;
		for (int i = 999; i > 899; i--) {
			for (int j = 999; j >= i; j--) {
				palindrom = i * j;
				int fig1 = palindrom / 100000;
				int fig2 = (palindrom % 100000) / 10000;
				int fig3 = (palindrom % 10000) / 1000;
				int fig4 = (palindrom % 1000) / 100;
				int fig5 = (palindrom % 100) / 10;
				int fig6 = (palindrom % 10);

				if (fig1 == fig6 && fig2 == fig5 && fig3 == fig4) {
					if (palindrom > maxPalindrom) {
						maxPalindrom = palindrom;
					}
				}
			}
		}
		return maxPalindrom;
	}
}