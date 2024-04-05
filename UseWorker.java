
public class UseWorker {
	public static void main(String[] args) {
		Worker w=new Worker();
		w.name="Sandhya R";
		w.salary=800000;
		w.gender="female";
		w.experience=5.6f;
		w.id=123456;
	    w.show();
	 Worker w1=new Worker();
	   w1.name="Padmasree";
		w1.salary=700000;
		w1.gender="female";
		w1.experience=4.9f;
		w1.id=123457;
		w1.show();
	 Worker w2=new Worker();
	  w2.name="Geetha";
	  w2.salary=650000;
	  w2.gender="female";
	  w2.experience=4.7f;
	  w2.id=123458;
	  w2.show();
	 Worker [] workers= {w,w1,w2};
      System.out.println(w2.maximum(workers).salary);
	}
}
	  
	


