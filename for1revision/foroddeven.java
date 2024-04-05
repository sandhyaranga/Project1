package for1revision;

public class Foroddeven {
public static void main (String[] args) {
	String [] a= {"Java","Python","C++","Javascript","HTML"};
	for(int i=0;i< a.length;i++){
		if(a.length() %2==0) {
			System.out.println(a.substring(a.length /2-1,a.length)/2+1));
			else {
				System.out.println(a.charAt(a.length()/2));
			}
			
		
