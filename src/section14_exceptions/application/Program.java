package section14_exceptions.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
		} catch (InputMismatchException e) {
			System.out.println("Imput Error - only interger numbers");
		}
		
		System.out.println("fim");
		
		sc.close();
		
	}

}
