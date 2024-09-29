package sec8_objects.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class TestRectangule {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangule rectangule = new Rectangule();
		
		System.out.println("Enter rectangule width and height");
		rectangule.setLargura(sc.nextDouble());
		rectangule.setAltura(sc.nextDouble());
		double area = rectangule.areaRetangulo();
		double perimeter = rectangule.perimeterRetangulo();
		double diagonal = rectangule.diagonalretangulo();
		
		System.out.printf("AREA : %2.2f%n", area);
		System.out.printf("PERIMETER : %2.2f%n", perimeter);
		System.out.printf("DIAGONAL : %2.2f%n", diagonal);
		
		sc.close();

	}

}
