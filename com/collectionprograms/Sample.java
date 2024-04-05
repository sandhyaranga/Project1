package com.collectionprograms;

import java.util.ArrayList;

public class Sample {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(26);
		nums.add(9);
		nums.add(50);
		nums.set(1,30);
		System.out.println(nums.get(1));
		nums.remove(2);
		System.out.println(nums.get(2));
		System.out.println(nums.size());
		}
}
