package section10_array_list.exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExListaSec10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> employee = new ArrayList<Employee>();
		
		System.out.println("How many employees will be registered?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #"+ i + 1);
			System.out.println("Id:");
			Integer id = sc.nextInt();
			
			// teste com IF
// 			Integer id = null;
// 			Integer temp = sc.nextInt();
//			if(hasId(employee, temp) == false) {
//				id = temp;
//			} else {
//				System.out.println("Id already exists in list!");
//				break;
//			}
			// teste com while
			
			while (hasId(employee, id)) {
				System.out.println("Id already taken! Try again:");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Salary:");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			employee.add(emp);
		}
		
		Integer idIncrease;
		Double percent;
		
		System.out.println();
		System.out.println("Enter the employee id that wil have salary increase:");
		idIncrease = sc.nextInt();
		
		// busca para saber se existe o Id informado = usando lambda
		Employee emp = employee.stream().filter(item -> item.getId() == idIncrease).findFirst().orElse(null);
		// teste
		if (emp == null){
			System.out.println("This Id don't exist!");
		} else {
			System.out.println("Enter the percentage:");
			percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		
		
		// busca usando uma função auxiliar position(list, int)
//		Integer pos = position(employee, idIncrease);
//		if (pos == null){
//			System.out.println("This Id don't exist!");
//		} else {
//			System.out.println("Enter the percentage:");
//			percent = sc.nextDouble();
//			
//			employee.get(pos).increaseSalary(percent);
//		}
		
		sc.close();
		for (Employee e: employee) {
			System.out.println(e);
		}

	}
	
	public static Boolean hasId(List<Employee> emp, Integer id) {
		Employee test = emp.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
		if (test == null) return false;
		return true;
		
	}
	
	public static Integer position(List<Employee> list, Integer id) {
		Integer hasid = null;
		
		for(Employee employee: list) {
			if (employee.getId() == id) {
				hasid = list.indexOf(employee);
			}
	}
		return hasid;
	}
	
	public static Integer positionFor(List<Employee> list, Integer id) {
		// professor Nelio
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
