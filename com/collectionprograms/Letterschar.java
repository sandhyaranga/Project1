package com.collectionprograms;

import java.util.ArrayList;

public class Letterschar {
	public static void main(String[] args) {
	ArrayList<Character>name=new ArrayList<>();
	name.add('A');
	name.add('B');
	name.add('C');
	name.add('D');
	name.add('E');
	name.add('G');
	name.add('H');
	name.add('I');
	name.add('J');
	name.add('K');
	for(int i=0;i<name.size();i++) {
		System.out.println(name.get(i));
	}
	for(int i=name.size()-1;i>=0;i--) {
		System.out.println(name.get(i));
	}
	}
}


