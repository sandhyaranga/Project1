
package functions;

public class Calculator {
public int add() {
	return 10+20;
	}
public void sub() {
	int c=20-10;
  System.out.println(c);
	}
public String findOddOrEven(int a) {
	if(a%2==0) {
		return "even";
	}
	else {
		return "odd";
	}
	}
public int findGreatest(int d,int e,int f,int g) {
	if(d>e && d>f && d>g) {
	return d;
	}
	else if(e>d && e>f && e>g) {
		return e;
	}
	else if(f>d && f>e && f>g) {
		return f;
	}
	else {
		return g;
}
}

public String primenumber(int num) {
boolean b=true;
for(int i=2; i<num; i++) {
	if (num % i ==0) {
		b=false;
	}
}
if(b==true) {
 return "Prime";
}
else {
return ("Not a prime");
}
}


public void fibonacci () {
	int a=0;
	int b=1;
	int c;
for (int i=0; i <=7; i++) {
	c=a+b;
	System.out.println(c);
	a=b;
	b=c;
}
}



public String palindrome(String a) {
	String b="";
	for (int i=a.length()-1; i>=0; i--) {
		b=b+a.charAt(i);
	}
	if (a.equals(b)) {
		return("Palindrome");
	}
	else {
		return ("Not a Palindrome");
	}
	}


public void duplicate (String a) {
	char []ch=a.toCharArray();
	for(int i=0;i<ch.length;i++) {
		int count=0;
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				count++;
				ch[j]='$';
			}
		}
		if(count >0 &&ch[i]!='$') {
			System.out.println(ch[i]);
		}
	    }
		}
		

public int group(int [] a) { 
	int c=0;
	for(int i=0;i<a.length;i++) {
	int count=0;
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			count++;
			a[j]='$';
		}
	}
	if(count==0 && a[i]!='$') {
		c++;
	}
}
return c;
}



public int maximum(int[] num1) {
	int max=num1[0];
	for(int i=0;i<num1.length;i++) {
		if(num1[i]>max) {
			max=num1[i];
		}
	}
	return max;
}
}


		
	



 
	







	
	

	
	
