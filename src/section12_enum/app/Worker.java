package section12_enum.app;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
// attributes
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List<HourContract> contracts = new ArrayList<HourContract>();
	
// constructors
	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	
// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = WorkerLevel.valueOf(level);
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(String nameDepartment) {
		Department department = new Department(nameDepartment);
		
		this.department = department;
	}
	
	public List<HourContract> getContract() {
		return contracts;
	}

	// apenas add e remove pelos métodos; não é possível trocar a lista
//	public void setContract(List<HourContract> contract) {
//		this.contracts = contract;
//	}
	
	

	// methods
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer mounth) {
		double sum = baseSalary;
		
		for (HourContract c: contracts) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
	// mês do calandar começa com 0
			int c_mouth = cal.get(Calendar.MONTH) + 1;
			
			if (c_year == year && c_mouth == mounth) {
				sum += c.totalValue();
			}
		}
		
		
		return sum;
	}

	@Override
	public String toString() {
		return String.format("Worker [name=%s, level=%s, baseSalary=%s, department=%s]", name, level, baseSalary,
				department.getName());
	}



	


	
	
}
