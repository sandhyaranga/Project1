package day1;

public class UseEmployee {
	public static void main(String [] args) {
		Employee employee1=new Employee();
		employee1.name="Lakshmi";	
	   employee1.salary=30000;
	   Employee employee2=new Employee();
	   employee2.name="Padmavathi";
      employee2.salary=50000;
      Employee employee3=new Employee();
      employee3.name="Geetha";
      employee3.salary=60000;
      Employee [] emps= {employee1,employee2,employee3};
      Employee max=emps[0];
      for(int i=0;i<emps.length;i++) {
    	  if(emps[i].name.contains("h")) {
    		  if(emps[i].salary >max.salary) {
    			  max=emps[i];
    		  }
    	  }
    	  
}
System.out.println("Salary:"+ max.salary+" +max.name);
}
}
				

