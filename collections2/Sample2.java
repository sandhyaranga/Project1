package collections2;

import java.util.HashMap;

public class Sample2 {
	public static void main(String[] args) {
		HashMap<Integer,String>var=new HashMap <> ();
		var.put(232387, "Sandhya");
		var.put(232389, "Preethi");
		var.put(232390,"Saanvi");
		var.put(232391, "Sadhana");
		var.put(232392, "Lakshmi");
		for(Integer x:var.keySet()) 
		{
			System.out.println(x);
		}
		for(String y:var.values()) {
			System.out.println(y);
		}
		for(Integer x:var.keySet()) {
			if(x > 232390) {
				System.out.println(x+" = "+var.get(x));
			}
			for(String y:var.values()) {
				if(y.startsWith("S") && y.endsWith("a")) {
					System.out.println(y);
				}
				}
			for(String y:var.values() ) {
				if(y.startsWith("S") && y.endsWith("a")) {
					continue;
				}
				else {
					System.out.println(y);
				}
					
			}
			for(Integer z:var.keySet()) {
				if(z%2==0) {
					System.out.println(var.get(z));
				}
			}
			
			var.keySet().forEach(j-> {
			if(j%2==0) 
			{
				System.out.println(var.get(j).charAt(var.get(j).length()-2));
			}});
		
		}
	}
}


