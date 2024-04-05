package for2;

public class Reversefor {
	public static void main (String[] args) {
		int []nums=new int[6];
		nums[0]=24;
		nums[1]=45;
		nums[2]=83;
		nums[3]=78;
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println(nums[i]);
		}
		}
}
