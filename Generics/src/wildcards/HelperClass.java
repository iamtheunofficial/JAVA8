package wildcards;

import java.util.ArrayList;
import java.util.List;

class A1{
	
	public  void run(List<? extends Number> g) {

//		g.set(0, g.get(0));  we will get CE bcz the compiler will capture as object and not able to identify what type of object is added
		
		// with the help of helper method which as type paramter so the compiler infer the type of paramter
		foo(g);
	}

	
	// helpermethod
	private<T> void foo(List<T> g) {
		g.set(0,g.get(0));
		g.add(g.get(0));
		System.out.println(g.size());
		
	}
}


public class HelperClass {
public static void main(String[] args) {
	A1 a=new A1();
	List<Integer> l2=new ArrayList<>();
	l2.add(0);
	a.run(l2);
}
}
