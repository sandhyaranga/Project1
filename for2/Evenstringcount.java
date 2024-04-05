package for2;

public class Evenstringcount {
	public static void main (String[] args) {
		String []a= {"Sandhya","Padmasree","Geetha","Sruthi","Preethi"};
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i].length()%2==0) {
				count=count+1;
			}
		}
	System.out.println(count);
	}
}


