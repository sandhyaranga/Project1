package for2;

public class UseEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "Sandhya";
		employee.age = 30;
		employee.gender = "Female";
		employee.salary = 50000;
		employee.shift = "Day";

		Employee employee1 = new Employee();
		employee1.name = "Padmasree";
		employee1.age = 34;
		employee1.gender = "Female";
		employee1.salary = 60000;
		employee.shift="Night";

		Employee employee2 = new Employee();
		employee2.name = "Geetha";
		employee2.age = 35;
		employee2.gender = "Female";
		employee2.salary = 80000;
		employee2.shift = "Day";

		Employee employee3 = new Employee();
		employee3.name = "Ranganathan";
		employee3.age = 37;
		employee3.gender = "Male";
		employee3.salary = 90000;
		employee3.shift = "Evening";

		Employee employee4 = new Employee();
		employee4.name = "Sekhar";
		employee4.age = 38;
		employee4.gender = "Male";
		employee4.salary = 100000;
		employee4.shift = "Night";

		Employee employee5 = new Employee();
		employee5.name = "Preethi";
		employee5.age = 24;
		employee5.gender = "Female";
		employee5.salary = 60000;
		employee5.shift = "Day";

		Employee[] emps = { employee, employee1, employee2, employee3, employee4, employee5 };
		// for(int i=0;i<emps.length;i++) {
		// if(emps[i].gender.equals("Female")) {
		// System.out.println(emps[i].name+" "+emps[i].age+" "+emps[i].gender+"
		// "+emps[i].salary+" "+emps[i].shift);
		// }
		// }
		// for(int i=0;i<emps.length;i++) {
		// if(emps[i].age > 25) {
		// System.out.println(emps[i].name+" "+emps[i].age+" "+emps[i].gender+"
		// "+emps[i].salary+" "+emps[i].shift);
		// }
		// }

		//for (int i = 0; i < emps.length; i++) {
			//if (emps[i].salary>50000) {
				//System.out.println(emps[i].name.toUpperCase() + " " + emps[i].age + " " + emps[i].gender + " "
						//+ emps[i].salary + " " + emps[i].shift);

			//}
		//}
						
		Employee max=emps[0];
		for(int i=0;i<emps.length;i++) {

			if (emps[i].salary > max.salary) {
				max= emps[i];
			}
		}
		System.out.println(max.name+" "+max.age+" "+max.gender+" "+max.salary+" "+max.shift);
		
			}
		}

