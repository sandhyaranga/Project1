 package for2;

public class Maximiumvalue {
	public static void main(String[] args) {
		int [] nums= {24,6,82,55,67,98};
		int max=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
	}
}



