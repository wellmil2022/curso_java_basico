package sec8_objects.estatico;


import java.util.Scanner;

public class TestCalculatorSphere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius (m): ");
		double radius = sc.nextDouble();
		
		double circunference = CalculatorSphere.circunference(radius);
		double volume = CalculatorSphere.volume(radius);
		
		System.out.printf("Circunference = %.2f m%n",circunference);
		System.out.printf("Circunference = %.2f m³%n",volume);
		
		//double value = 4.2352989244d;
		
		sc.close();

	}

}
