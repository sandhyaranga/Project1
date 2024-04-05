
public class Worker {
	String name;
	int salary;
	String gender;
	float experience;
	int id;
public void show() {
System.out.println(name+" "+salary+" "+gender+" "+experience+" "+id+" ");
}
public Worker maximum(Worker[]workers) {
	Worker max=workers[0];
	for(int i=0;i<workers.length;i++) {
		if(workers[i].salary>max.salary) {
			max=workers[i];
		}
	}
	return max;
}
}



