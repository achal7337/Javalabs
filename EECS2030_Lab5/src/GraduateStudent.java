import java.util.Date;

public class GraduateStudent extends Student{
	private String supervisor;
	public GraduateStudent(String name, Date date, String sID) {
		super(name,date,sID);
	}

	public String getThesisSupervisor() {
		return this.supervisor;
	}
	
	public void setThesisSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	

	@Override
	public String toString() {
		return "GraduateStudent [supervisor=" + supervisor + "]";
	}

	
}
