package section12_enum.app;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	
	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Double getValuePerHour() {
		return valuePerHour;
	}



	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}



	public Integer getHours() {
		return hours;
	}



	public void setHours(Integer hours) {
		this.hours = hours;
	}



	public Double totalValue() {
		return this.valuePerHour * hours;
	}


	@Override
	public String toString() {
		return String.format("HourContract [date=%s, valuePerHour=%s, hours=%s]", date, valuePerHour, hours);
	}



	
}
