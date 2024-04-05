package functions1;

public class UseEmployee {
	public static void main (String [] args) {
		Employee employee=new Employee();
		employee.name="Sandhya";
		employee.age=24;
	    employee.gender="Female";
		employee.salary=60000;
		employee.shift="DAY";
		Employee employee1=new Employee();
		employee1.name="Sahana";
		employee1.age=26;
		employee1.gender="Female";
		employee1.salary=50000;
		employee1.shift="DAY";
		Employee [] emp= {employee,employee1};
		employee1.getAgeDetails(emp);
	}
}
		
		
		
		
		
		
		
		


