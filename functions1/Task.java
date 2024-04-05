package functions1;

public class Task {
	public int findFact(float[] a) {
		float min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i] < min) {
				min=a[i];
			}
		}
		int mini=(int) min;
		int fact=1;
		for(int i=1;i<mini
				;i++){
			fact=fact*i;
		}
		return fact;
		}
	}
