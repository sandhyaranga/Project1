package collections2;

import java.util.HashMap;

public class ValueAndKey {
	public static void main(String[] args) {
		HashMap<Integer,String> var=new HashMap <> ();
		var.put(10,"Saanvi");
		var.put(20, "Preethi");
		var.put(30, "Lakshmi");
		var.put(40, "Saanvi");
		System.out.println(var.keySet());
		System.out.println(var.values());
		System.out.println(var);
		var.remove(40);
		System.out.println(var);
		for(Integer x:var.keySet()) 
		{
			System.out.println(x);
		}
		for(Integer x:var.keySet()) {
			System.out.println(x+" = "+var.get(x));
			
		}
		for(String y:var.values()) {
			System.out.println(y);
		}
		var.keySet().forEach(x-> System.out.println(x));
		var.values().forEach(x-> System.out.println(x));
		var.keySet().forEach(x-> System.out.println(x+" = "+var.get(x)));
		var.forEach((x,y)->System.out.println(x+" = "+y));
	}
}
