package functions1;

public class Employee {
	String name;
	int age;
	String gender;
	int salary;
	String shift;
	public void getAgeDetails(Employee[] e) {
		for(int i=0;i<e.length;i++) {
			if(e[i].age >=25) {
				System.out.println(e[i].name+" "+e[i].age);
			}
		}
	}
}
