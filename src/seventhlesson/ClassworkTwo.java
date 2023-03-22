package seventhlesson;

import java.util.Scanner;
import java.util.Arrays;

public class ClassworkTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h;
		int w;
		System.out.println("Enter height");
		h = sc.nextInt();
		System.out.println("Enter weight");
		w = sc.nextInt();
		
		pict(h, w);
	}
	
	/**
	 * Method is draw figure
	 * 
	 * @param h is a height figure
	 * @param w is a weight figure
	 * 
	 */
	
	
	public static void pict(int h, int w) {
		for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i == 1 || i == h) {
                    System.out.print("*");
                } else if (j == 1 || j == w) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}