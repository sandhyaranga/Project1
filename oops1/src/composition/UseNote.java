package composition;

public class UseNote {
	public static void main (String [] args) {
		Paper p1=new Paper();
		p1.colour="White";
		p1.isRuled=false;
		Note n1=new Note();
		n1.brand="Classmate";
		n1.price=50;
		n1.isQuality=true;
		n1.noOfPages=120;
		n1.paper=p1;
		System.out.println(n1.brand+" "+n1.price+" "+n1.isQuality+" "+n1.noOfPages+" "+n1.paper.colour+" "+n1.paper.isRuled);
		
	}
}


