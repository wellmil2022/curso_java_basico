package sec8_objects.estudante;

import java.util.Locale;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		double notes[] = {0,0,0};
		System.out.println("Name: ");
		student.setName(sc.nextLine());
		System.out.println("Nota1: ");
		notes[0] = sc.nextDouble();
		System.out.println("Nota2: ");
		notes[1] = sc.nextDouble();
		System.out.println("Nota3: ");
		notes[2] = sc.nextDouble();
		
		student.setFinalGrade(notes);
		System.out.printf("FINAL GRADE: %.2f.%n",student.getFinalGrade());
		
		if(student.getFinalGrade() > 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS.%n",student.missingPoints());
		}
		
		
		sc.close();
	}

}
