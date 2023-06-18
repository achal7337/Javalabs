import java.util.Date;

public class SalariedEmployee extends Employee {
	 private double swage;
	 protected SalariedEmployee(String name,Date date,String eID) {
		 super(name,date,eID);
	 }
	public double getsWage() {
		return swage;
	}
	
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + swage + "]";
	}
	public void setSalary(int swage) {
		this.swage = swage;
		
	}
}
