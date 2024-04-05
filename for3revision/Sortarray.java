package for3revision;

import java.util.Arrays;

public class Sortarray {
	public static void main(String[] args)
	{
		String []a= {"abcd","efgh","acdb","bcdf","bbgh"};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
