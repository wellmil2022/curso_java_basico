package sec8_objects.funcionario;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double NetSalary() {
		return this.getGrossSalary() - this.tax;
	}
	
	public void increaseSalary(double percentage) {
	//	double increasing = this.getGrossSalary()+(this.getGrossSalary() * (percentage / 100));
		this.setGrossSalary(this.getGrossSalary()+(this.getGrossSalary() * (percentage / 100)));
	}
	
	@Override
	public String toString() {
		return this.name
				+ ", $ "
				+ this.NetSalary();
	}
	
}
