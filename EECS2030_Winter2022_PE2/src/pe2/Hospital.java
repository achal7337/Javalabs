package pe2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BooleanSupplier;
/* PLEASE DO NOT MODIFY A SINGLE STATEMENT IN THE TEXT BELOW.
READ THE FOLLOWING CAREFULLY AND FILL IN THE GAPS

I hereby declare that all the work that was required to 
solve the following problem including designing the algorithms
and writing the code below, is solely my own and that I received
no help in creating this solution and I have not discussed my solution 
with anybody. I affirm that I have read and understood
the Senate Policy on Academic honesty at 
https://secretariat-policies.info.yorku.ca/policies/academic-honesty-senate-policy-on/
and I am well aware of the seriousness of the matter and the penalties that I will face as a 
result of committing plagiarism in this assignment.

BY FILLING THE GAPS,YOU ARE SIGNING THE ABOVE STATEMENTS.

Full Name: 
Student Number: 
Course Section:  
*/  

public class Hospital{
	public Director director;
	public List<Patient> patients= new ArrayList<Patient>();
	public List<Physician> physicians= new ArrayList<Physician>();

	public Hospital(Director director) {
		this.director = director;
	}

	public boolean admitPatient(Patient p) throws NoSpaceException{
		if (patients.size()<500) {
			if (patients.contains(p)) {
				return false;
			}
			else
			{
				
				for (Physician phys : physicians) {
					if(!phys.hasMaximumpatient()) {
						patients.add(p);
						phys.assignPatient(p);
						patients.get(patients.size()-1);
						Patient.setAssignedPhysician(phys);
						return true;
					}
				}
				throw new NoSpaceException();
			}
		}  
		throw new NoSpaceException();
	}

	public Director getHospDirector() {
		return director;
	}
}
class Person{
	String firstName;
	String lastName;
	int age;
	String gender;
	String address;
	String name;
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gender
	 * @param address
	 */
	public Person(String firstName, String lastName, int age, String gender, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 
	 * @return
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return firstName  + ", " + lastName;
	}
	public void setName(String name) {
		this.name = firstName  + ", " + lastName;
	}

}
class Employee extends Person {
	protected int employeeID;
	private static int id = 100;
	
	
	public Employee(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
		employeeID = id;
		id++;
	}
	
	public int getEmployeeID() {
		return this.employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
}

class SalariedEmployee extends Employee {
	double salary = 0.0;

	public SalariedEmployee(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Volunteer extends Employee {
	public Volunteer(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}
	
	public String toString() {
		return "Volunteer " + "[[" + getEmployeeID() + ",[" + getFirstName() + ", " + getLastName() + ", " + getAge()
				+ ", " + getGender() + ", " + getAddress() + "]]]";
	}
	
}
class Administrator extends SalariedEmployee {
	String speciality;
	String physicianSpeciality;
	String adminSpecialtyType;

	public Administrator(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getPhysicianSpeciality() {
		return physicianSpeciality;
	}

	public void setPhysicianSpeciality(String physicianSpeciality) {
		this.physicianSpeciality = physicianSpeciality;
	}

	public String getAdminSpecialtyType() {
		return adminSpecialtyType;
	}

	public void setAdminSpecialtyType(String adminSpecialtyType) {
		this.adminSpecialtyType = adminSpecialtyType;
	}

}



class PhysicianAdministrator extends Administrator {
	public PhysicianAdministrator(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}
	
	public Object e() {

		return firstName + ", " + lastName;
	}

	public String toString() {
		return "PysicianAdministrator " + "[[[" + getEmployeeID() + ",[" + getFirstName() + ", " + getLastName() + ", "
				+ getAge() + ", " + getGender() + ", " + getAddress() + "]], " + getSalary() + "], "
				+ getAdminSpecialtyType() + "]";
	}
	
	
	
}




class Director extends Administrator {
	
	
	public Director(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}

}

class Patient extends Person implements Comparator<Patient>{
	private int patientID;
	private static int idp = 1000;
	Physician  phys;

	public Patient(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
		patientID = idp;
		idp++;
	}
	public static  void setAssignedPhysician(Physician phys) {
		phys= phys;

	}
	
	public Physician getAssignedPhysician() {
		return phys;
	}  
	
	public int getPatientID() {
		return patientID;

	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}
	public String toString() {
		return "Patient " + "[" + getPatientID() + ", [" + getFirstName() + ", " + getLastName() + ", " + getAge()
				+ ", " + getGender() + ", " + getAddress() + "]]";
	}
	@Override
	public int compare(Patient p1, Patient p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
}

class Physician extends SalariedEmployee {
	public Physician(String firstName, String lastName, int age, String gender, String address) {
		super(firstName, lastName, age, gender, address);
	}
	
	public void assignPatient(Patient p) {
		
	}

	public boolean hasMaximumpatient() {
		
		return false;
	}

	public String toString() {
		return "Physician " + "[[[" + getEmployeeID() + ",[" + getFirstName() + ", " + getLastName() + ", " + getAge()
				+ ", " + getGender() + ", " + getAddress() + "]], " + getSalary() + "]]";
	}

	
}


class NoSpaceException extends Exception{
	public NoSpaceException() {
		super();
	}
	
	public NoSpaceException(String s) {
		super(s);
	}

}