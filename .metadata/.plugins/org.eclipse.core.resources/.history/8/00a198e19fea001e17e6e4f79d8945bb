package streamObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car("Toyota",1000000,"Red",true,6);
		Car c2=new Car("Volkswagen",2000000,"White",true,5);
		Car c3=new Car("BMW",3000000,"Blue",false,6);
		Car c4=new Car("BMW",2000000,"Maroon",true,4);
		Car c5=new Car("BMW",5000000,"Brown",true,4);
		ArrayList<Car> cars=new ArrayList <>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		//cars.stream().forEach(x-> System.out.println(x));
        //System.out.println("************");
		
	  //List<Car> price1=cars.stream().filter(x->x.getPrice() >1000000).collect(Collectors.toList());
		//price1.forEach(x->System.out.println(x));
		//System.out.println("************");
		
	 //List<Car> colour1=cars.stream().filter(x->x.getColour().equals("White")).collect(Collectors.toList());
		//colour1.forEach(x->System.out.println(x));
		//System.out.println("*************");
		
		//List<Car> Petrol=cars.stream().filter(x->x.isPetrol()==true).collect(Collectors.toList());
		//Petrol.forEach(x->System.out.println(x));
		
		
		List<String>brands=cars.stream().map(x->x.getBrand()).collect(Collectors.toList());
	    brands.forEach(x->System.out.println(x));
		
		//List<Car>prices=cars.stream().filter(x->x.getNoOfSeats() > 4).map(x-> {
		//x.setPrice(x.getPrice()+x.getPrice()*10/100);
		//return x;
		//}).collect(Collectors.toList());
        //prices.forEach(x->System.out.println(x));
      
		
		//List<Car>sort=cars.stream().sorted(Comparator.comparing(Car :: getPrice)).collect(Collectors.toList());
        //sort.forEach(x->System.out.println(x));
      //System.out.println("**************");
      
      //Car max=cars.stream().max(Comparator.comparing(Car :: getNoOfSeats)).get();
      //System.out.println(max);
      //System.out.println("*********");
      
      //Car min=cars.stream().min(Comparator.comparing(Car :: getNoOfSeats)).get();
      //System.out.println(min);
      //System.out.println("*********");
		
		//List<Car>limit=cars.stream().limit(2).collect(Collectors.toList());
		//limit.forEach(x->System.out.println(x));
		//System.out.println("***********");
		
		//List<Car>skip=cars.stream().skip(2).collect(Collectors.toList());
		//skip.forEach(x->System.out.println(x));
		//System.out.println("***********");
		
		//List<String> distinct=cars.stream().map(x->x.getBrand()).distinct().collect(Collectors.toList());
		//distinct.forEach(x->System.out.println(x));
		//System.out.println("***********");

		//Map<String,Car> mapping=cars.stream().filter(x->x.getBrand().startsWith("T")).collect(Collectors.toMap(x->x.getBrand(),y->y));
		//mapping.forEach((x,y)->System.out.println(x+""+y));
		//System.out.println("***********");
		
		
      
      
	}
}

		

