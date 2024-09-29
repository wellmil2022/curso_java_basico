package section12_enum.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Enter department's name:");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String workerName = sc.nextLine();
		System.out.println("Level:");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary:");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(
				workerName,
				WorkerLevel.valueOf(workerLevel),
				baseSalary,
				new Department(departmentName));
		
		
		System.out.println("How many contracts to this worker?");
		int number = sc.nextInt();
		
		//<HourContract>
		//List<HourContract> hourContract = new ArrayList<HourContract>();
		for(int i = 1; i <= number; i++) {
			System.out.println("Enter contract #"+ i +" data:");
			//Date date = new Date();
			//data
			sc.nextLine();
			System.out.println("Date (DD/MM/YYYY):");
			Date contractDate = new Date();
			
			try {
				contractDate = sdf.parse(sc.nextLine());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Value per hour:");
			Double valueHour = sc.nextDouble();
			
			System.out.println("Duration (hours):");
			Integer hours = sc.nextInt();
			
			worker.addContract(new HourContract(contractDate, valueHour, hours));
			
		}
		
		
		
	
		
		System.out.println(worker);
		
		for (HourContract showContract: worker.getContract() ) {
			System.out.println(showContract);
		}
		
		System.out.println();
		System.out.println("Enter mouth and year to calculate income (MM/YYYY):");
		sc.nextLine();
		String mouthAndYear = sc.nextLine();
		int mouth = Integer.parseInt(mouthAndYear.substring(0, 2));
		int year = Integer.parseInt(mouthAndYear.substring(3));
		System.out.println("Name:"+ worker.getName());
		System.out.println("Department:"+ worker.getDepartment().getName());
		System.out.printf("Income: %.2f", worker.income(year, mouth));
		
		
		sc.close();
		

	}

}
