package for2;

public class Minimumvalue {
	public static void main(String[] args) {
		int [] nums= {24,6,82,55,67,98};
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]< min) {
				min=nums[i];
			}
		}
		System.out.println(min);
	}
}

