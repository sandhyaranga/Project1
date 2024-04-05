package for3;

public class Intarray {
	public static void main(String[] args) {
		int[] num= {1,2,5,2,5,3,4,5,6};
		for(int i=0;i<num.length;i++) {
			int dup=0;
			int nondup=0;
			int count=0;
			for(int j=i+1;j<num.length;j++) {
				if(num[i]==num[j]) {
					count++;
					num[j]='$';

				}
			}
			if(count > 0 && num[i]!='$') 
			{
				dup++;
				}
			else if(count==0 && num[i]!='$')
			{
				nondup++;
			
			}
		}
		System.out.println("duplicate "+ dup+"nonduplicate "+ nondup);
	}

}
