import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	private Date date;
	public final String name;
	
	public Person(String name,Date date) {
		this.name = name;
		this.date = (Date)date.clone();
	}
	
	public Date getDob() {
		return (Date)date.clone();
	}
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Name:"+this.name + "\nDOB: "+ this.date +" \n";
	}
	
	

 
public static void main(String[] args) {
 List <Person> p = new ArrayList<Person>();
 Person a = new Person("achal",new Date());
 p.add(a);
 List <Student> s = new ArrayList<Student>();
 Student b = new Student("achal", new Date(),"123456");
 Student c = new Student("ac2hal", new Date(),"1223456");
 
 
 s.add(b);
 s.add(c);
 Map<String,String> map = new HashMap<>();
 
 for (Student ps : s) {
	 map.put(ps.getsID(),ps.getName());
 }
 
 System.out.println("Map: "+ map);
} 
}

class Boss{
	private final List<Employee> emp;
	Boss(List<Employee> emp){
		this.emp = emp;
	}
	public List<Employee> getemp(){
		return emp;
	}
	
}
 
 
 
 
 
 
 
 
 
 
 

