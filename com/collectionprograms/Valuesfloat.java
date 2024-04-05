package com.collectionprograms;

import java.util.ArrayList;

public class Valuesfloat {
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
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		for(int i=nums.size()-1;i>=0;i--) {
			System.out.println(nums.get(i));
		}
	}

}
