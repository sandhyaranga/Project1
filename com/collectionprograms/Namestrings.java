package com.collectionprograms;

import java.util.ArrayList;

public class Namestrings {
	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<>();
		names.add("Sandhya");
		names.add("Sruthi");
		names.add("Geetha");
		names.add("Ananya");
		names.add("Saanvi");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		for(int i=names.size()-1;i>=0;i--) {
			System.out.println(names.get(i));
		}
	}
}
	


