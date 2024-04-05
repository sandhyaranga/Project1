package com.collectionprograms;

import java.util.ArrayList;

public class Valueslong {
	public static void main (String[] args) {
	ArrayList<Long>num=new ArrayList<>();
	num.add(1012345679l);
	num.add(1124678943l);
	num.add(3459876543l);
	num.add(545678954321l);
	num.add(8961234567l);
	num.add(634545780987654l);
	num.add(678243658764235l);
	num.add(45234568578674l);
	num.add(7123498897877654l);
	num.add(888842345567809l);
	for(int i=0;i<num.size();i++) {
		System.out.println(num.get(i));
	}
	for(int i=num.size()-1;i>=0;i--) {
		System.out.println(num.get(i));
	}
}
}



