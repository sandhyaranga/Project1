package com.collectionprograms;

import java.util.ArrayList;

public class Foreach1 {
	public static void main(String[] args) {
		ArrayList<Float>nums=new ArrayList<>();
		nums.add(10.5f);
		nums.add(11.24f);
		nums.add(3.45f);
		nums.add(5.4f);
		nums.add(8.96f);
		nums.add(6.345f);
		nums.add(6.78243f);
		nums.add(4.5234f);
		nums.add(7.1234f);
		nums.add(8.8884f);
		nums.forEach(x->System.out.println(x));
	}
}
