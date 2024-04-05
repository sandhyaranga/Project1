package for3revision;

import java.util.Arrays;

public class Removeduplicatesandsort {
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int [] b= {3,4,5,6};
		int []result = new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
			if(count==0) {
				result[i]=a[i];
			}
		}
			for(int i=0;i<b.length;i++) {
				int count=0;
				for(int j=0;j<a.length;j++) {
					if(b[i]==a[j]) {
						count++;
					}
				}
				if(count==0) {
					result[i]=b[i];
					
				}
				}
			Arrays.sort(result);
			for(int i=0;i<result.length;i++) {
				if(result[i]!=0) {
					System.out.println(result[i]);
				}
			}
	}
}
			
