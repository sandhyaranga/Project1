
package encapsulation;

public class UseCompany {
	public static void main(String [] args) {
		Employee e=new Employee();
		e.setName("David");
		e.setId(24);
		e.setsalary(50000);
		Company c=new Company();
		c.setName("Onesoft");
		c.setLocation("OMR");
		c.setNoOfEmployees(100);
		c.setIsGood(true);
		c.setEmployee(e);
		System.out.println(c.getName()+" "+c.getLocation()+" "+c.getNoOfEmployees()+" "+c.getIsGood()+" "+c.getEmployee().getName()+" "+c.getEmployee().getId()+" "+c.getEmployee().getSalary());
	}
}
