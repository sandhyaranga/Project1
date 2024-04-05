package com.collectionprograms;

import java.util.ArrayList;

public class Foreachcondition2 {
	public static void main(String[] args) {
		ArrayList<Integer>num=new ArrayList<>();
		num.add(101234);
		num.add(1124678);
		num.add(3459876);
		num.add(545678);
		num.add(896123456);
		num.add(634545780);
		num.add(678243);
		num.add(452);
		num.add(712349889);
		num.add(888842345);
		num.forEach(x-> {
			if(x > 50) {
				System.out.println(x);
			}
		});
	}
}
	


