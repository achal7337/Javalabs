import java.util.Date;

public class Student extends Person {
	protected final String sID;
	public Student(String name, Date date,String sID) {
		super(name,date);
		this.sID = sID;
	}
	
	
	
	
	public String getsID() {
		return sID;
	}




	@Override
	public String toString() {
		return "Student [sID=" + sID + "]";
	}
	
	
}
