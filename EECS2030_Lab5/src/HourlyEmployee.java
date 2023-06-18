import java.util.Date;

public class HourlyEmployee extends Employee {
	 private double wage;
	 protected HourlyEmployee(String name,Date date,String eID) {
		 super(name,date,eID);
	 }
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + "]";
	}
	 
	 
}
