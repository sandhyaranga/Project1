package sampleJava8;

public class FindMax {
	public int findMax(int []a) {
		int max=a[0];
		for(Integer x:a) {
			if(x>max) {
				max=x;
			}
			}
	return max;
}
}
