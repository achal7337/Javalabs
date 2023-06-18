import java.util.Date;

public class Employee extends Person {
	protected final String eID;
	public Employee(String name, Date date,String eID) {
		super(name,date);
		this.eID = eID;
	}
	@Override
	public String toString() {
		return "Student [sID=" + eID + "]";
	}
	
	
	
}
