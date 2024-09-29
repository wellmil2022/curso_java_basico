package sec8_objects.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.setName(sc.nextLine());
		System.out.println("Gross Salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.println("Tax: ");
		employee.setTax(sc.nextDouble());
		System.out.printf("Employee: %s.%n",employee);
		
		System.out.println("Whitc percentage to increase salary?");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.printf("Update data: %s",employee);
		sc.close();

	}

}
