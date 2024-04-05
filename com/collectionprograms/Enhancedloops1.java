package com.collectionprograms;

import java.util.ArrayList;

public class Enhancedloops1 {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Sandhya");
		names.add("Sruthi");
		names.add("Geetha");
		names.add("Ananya");
		names.add("Saanvi");
		names.add("Lakshmi");
		names.add("Rathikha");
		names.add("Preethi");
		names.add("Sadhana");
		names.add("Swetha");
		for (String x:names) {
			if(x.startsWith("A")) {
				System.out.println(x);
			}
		}
	}

}
