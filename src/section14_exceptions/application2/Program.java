package section14_exceptions.application2;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main program start");
		Locale.setDefault(Locale.US);
		
		method1();
		
		System.out.println("Main program end");
		
		
		
	}
	public static void method1() {
		System.out.println("** Method 1 start**");
		method2();
		System.out.println("** Method 1 end **");
	}
	
	public static void method2() {
		System.out.println("** Method 2 start**");
		Scanner sc = new Scanner (System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Position");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Imput Error - only interger numbers");
		}
		sc.close();
		System.out.println("** Method 2 end **");
	}

}
