package wildcards;

import java.util.List;

class Demo<T>{
	
	
	// upper bound
	
//	if we use extends we can pass same type of child type of that class or interface
	// extends referes to both class and interface in geenrics
	public  void get(List<? extends Number> l) {
		
		int sum=0;
//		l.add(1); // error
		for(Number k:l) {
			sum+=k.doubleValue();
		}
		System.out.println(sum);
	}
	
	public  void d(List<T> l) {}
}


public class UpperBound {
public static void main(String[] args) {
	
	System.out.println("wildcard represent by <?>");
	System.out.println("if we are using wild card means ");
	System.out.println(" for upper bounds we can use <? extends class,interface");
	Demo<String> d1=new Demo();
	List<Integer> l=List.of();
	d1.get(l);  
	d1.get(List.of(1l,2l,3l));  // passing long value
	List<Integer> l2=List.of();
	
} 
}
