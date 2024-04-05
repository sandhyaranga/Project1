package encapsulation;

public class Company {
	private String name;
	private String location;
	private int noOfEmployees;
	private boolean isGood;
	private Employee employee;
	public void setName (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setLocation (String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public void setNoOfEmployees (int noOfEmployees) {
		this.noOfEmployees=noOfEmployees;
	}
	public int getNoOfEmployees () {
		return noOfEmployees;
	}
	public void setIsGood (boolean isGood) {
		this.isGood=isGood;
	}
	public boolean getIsGood() {
		return isGood;
	}
	public void setEmployee (Employee employee) { 
	this.employee=employee;
	}
	public Employee getEmployee() {
		return employee;
	}
}