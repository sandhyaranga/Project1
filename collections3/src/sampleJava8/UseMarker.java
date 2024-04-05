package sampleJava8;

public class UseMarker {
	public static void main(String[] args) {
		int[]z= {2,64,678,3145,999,7771};
	Marker m=a-> {
			for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println( a[i]+"is even");
				}
			else {
				System.out.println(a[i]+"is odd");
			}
			}
		};
		m.findEvenOrOdd(z);
		} 
	
	}


