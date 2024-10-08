package sec8_objects.triangulo;

import java.util.Locale;
import java.util.Scanner;

public class CalculaAreaTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measure of the triangle X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measure of the triangle Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c= sc.nextDouble();

		
		double areaX = x.areaTriangulo();
		double areaY = y.areaTriangulo();

		System.out.printf("Triangle X area = %.4f%n", areaX);
		System.out.printf("Triangle X area = %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area X");
		} else {
			System.out.println("Larger area Y");
		}

		sc.close();
	}

}
