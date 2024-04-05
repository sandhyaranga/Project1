package collections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Sandhya",'A',"Tenth grade",15,true);
		Student s2=new Student("Padmasree",'B',"Ninth grade",14,true);
		Student s3=new Student("Sadhana",'C',"Eight grade",13,true);
		Student s4=new Student("Swetha",'D',"Ninth grade",14,false);
		Student s5=new Student("Tapasya",'E',"Tenth grade",15,false);
		Student s6=new Student("Lakshmi",'F',"Seventh grade",12,true);
		Student s7=new Student("Subasree",'G',"Fifth grade",10,true);
		Student s8=new Student("Akshaya",'H',"First grade",5,true);
		Student s9=new Student("Padmini",'I',"Second grade",6,false);
		Student s10=new Student("Samyuktha",'J',"Third grade",8,true);
		HashMap <Character,Student> var1=new HashMap <> ();
		var1.put(s1.getSection(),s1);
		var1.put(s2.getSection(),s2);
		var1.put(s3.getSection(),s3);
		var1.put(s4.getSection(),s4);
		var1.put(s5.getSection(),s5);
		var1.put(s6.getSection(),s6);
		var1.put(s7.getSection(),s7);
		var1.put(s8.getSection(),s8);
		var1.put(s9.getSection(),s9);
		var1.put(s10.getSection(),s10);
		var1.keySet().forEach(j-> System.out.println(j));
		var1.values().forEach(j-> System.out.println(j));
		var1.keySet().forEach (x -> 
		{
			if(var1.get(x).getName().startsWith("A")) {
				var1.get(x).setAge(var1.get(x).getAge()+2);
				System.out.println(var1.get(x));
			}
		});
		Iterator <Character> n =var1.keySet().iterator();
		while(n.hasNext()) {
			System.out.println(n.next());
			
		}
		Iterator <Student> m =var1.values().iterator();
		while (m.hasNext()) {
			System.out.println(m.next());
		}
	}
}

			

