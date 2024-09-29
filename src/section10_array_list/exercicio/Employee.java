package section10_array_list.exercicio;

public class Employee {
	
	private Integer id; 
	private String name;
	private Double salary;
	
	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(Double percentage) {
		Double percent = percentage / 100;
		this.salary += (this.salary * percent); 
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, salary=%s]", id, name, salary);
	}
	
	
	
}
