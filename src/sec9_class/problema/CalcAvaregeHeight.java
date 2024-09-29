package sec9_class.problema;

import java.util.Locale;
import java.util.Scanner;

public class CalcAvaregeHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the quantity of people: ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		System.out.println("Write the heights: (1.0)");

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		sc.close();
		double total = 0, media = 0;
		for (int i = 0; i < vect.length; i++) {
			total += vect[i];
		}
		media = total / vect.length;
		System.out.println("Average Height: " + media);
	}

}
