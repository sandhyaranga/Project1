package for1revision;

public class Forevenodd {
	public static void main (String[] args) {
		String [] a= {"Java","Python","C++","Javascript","HTML"};
		for(int i=0;i< a.length;i++){
			if(a[i].length() %2==0) {
				System.out.println(a[i].substring(a[i].length() /2-1,a[i].length()/2+1));
			}
				else {
					System.out.println(a[i].charAt(a[i].length()/2));
				}
		}
	}
}


