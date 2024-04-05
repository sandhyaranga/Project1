package for2;

public class oddlength {
	public static void main(String[] args) {
		String []a= {"Sandhya","Padmasree","Preethi","Sruthi","Geetha"};
		for (int i=0;i<a.length;i++) {
			if(a[i].length()%2!=0) {
				System.out.println(a[i]);
			}
			}
	}
}
