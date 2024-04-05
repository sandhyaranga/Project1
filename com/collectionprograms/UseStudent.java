package com.collectionprograms;

import java.util.ArrayList;

public class UseStudent {
public static void main(String[] args) {
	Student s1=new Student(101,"Ananya",15,"Female");
	Student s2=new Student(102,"Lakshmi",21,"Female");
	Student s3=new Student(103,"Saanvi",15,"Female");
	Student s4=new Student(104,"Sadhana",25,"Female");
	ArrayList<Student>a=new ArrayList<>();
	a.add(s1);
	a.add(s2);
	a.add(s3);
	a.add(s4);
	//for(int i=0;i<a.size();i++) {
		//System.out.println(a.get(i));
	//}
	//for(Student x:a) {
		//System.out.println(x);
	//}
	//a.forEach(x->System.out.println(x));
	for(int i=0;i<a.size();i++) {
		if(a.get(i).getGender().equals("Female")) {
        	System.out.println(a.get(i));
        }
	}
	for(Student x:a) {
		if(x.getAge() < 25) {
			System.out.println(x);
		}
	}	
		a.forEach(x -> {
			if(x.getId() > 102 && x.getName().startsWith("L")) {
				System.out.println(x);
			}
		});
		
		ArrayList<Student>ageData=new ArrayList<>();
		for(int i=0;i<a.size();i++) {
			if(a.get(i).getAge()>20) {
				ageData.add(a.get(i));
			}
		}
		
		System.out.println(ageData);
		ageData.forEach(x->System.out.println(x));
		
		
		
		}
}


		
