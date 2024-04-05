package com.collectionprograms;

import java.util.ArrayList;

public class Stringvaluesq {
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
		for(int i=0;i<names.size();i++) {
        if(names.get(i).endsWith("a")) {
        	System.out.println(names.get(i));
        }
		}
        for(int i=0;i<names.size();i++) {
        	if(names.get(i).length()> 6) {
        		System.out.println(names.get(i));
        	}
        }
	}
} 
	

