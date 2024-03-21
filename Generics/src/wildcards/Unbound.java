package wildcards;

import java.util.ArrayList;
import java.util.List;

class Demo1{
	
	//it accepts any type of list
	public static void get(List<?> list) {
//		list.add(2);// error
		for(Object k:list) {
			System.out.println(k);
		}
	}
	
	// both method are different
	// it accepts only list<object> it will not accept list<String>,List<Integer>
	public static void get1(List<? extends Number> list) {
//		list.add(1l) // error we cant perform any additon only process
		list.remove(0);
	}
}


public class Unbound {
public static void main(String[] args) {
	System.out.println("unbounded wild cards");
	System.out.println("we use unbound like if we want to use methods of object class only");
	List<Integer> l2=new ArrayList<Integer>();
	Demo1.get(l2);
Demo1.get(List.of(1,2,3));


List<? extends Long> l=new ArrayList<>();  // for this i can add only null
//l.add(2l); // we cant any elements except null
}
}
