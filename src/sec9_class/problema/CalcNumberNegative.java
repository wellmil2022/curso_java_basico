package sec9_class.problema;

import java.util.Locale;
import java.util.Scanner;

public class CalcNumberNegative {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want write?");
		// n = quantity
		int n = sc.nextInt();
		int[] vect = new int[n];
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Write a number: ");
			//sc.nextLine();
			vect[i] = sc.nextInt();
		}
		sc.close();
		//show
//		for(int i = 0; i < vect.length; i++) {
//			System.out.print(vect[i]);
//		}
		//
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				System.out.println("Negative: "+vect[i]);
			}
			
		}
	}

}
