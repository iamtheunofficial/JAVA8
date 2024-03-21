package wildcards;

import java.util.ArrayList;
import java.util.List;

class A{}

class B extends A{
	void a() {};
}


class c{
	
	void run(List<? super B> k) {
//		k.get(0)  return objects
	}
	
	void g(List< ? super Integer> l) {
		l.add(1);  // we can add elements
		
		
	}
	
}

public class LowerBound {
public static void main(String[] args) {
	
	System.out.println("lower bound represent by <? super>");
	System.out.println("means we can pass same type of the parent type of that class or higher classes");

System.out.println("since we use lowerbound we will get return as object only");
System.out.println("but in the case of extends we can get method acces of that extend class or interface type because it is parent there but in the case of super it is child type so we can acces only parent type that is only object class methods");
	c c1=new c();
	
	List<B> l=new ArrayList<>();
	l.add(new B());
	c1.run(l);
	
	
	List<A> l2=new ArrayList<>();
	l2.add(new A());
	c1.run(l2);
	
	List<? super Integer> l3=new ArrayList<>();   // we can add elements
	l3.add(2);
	
	
	// since numbe ris parent and integer is child it works fine
	
	
	List<? extends Integer> a1=new ArrayList<>();
	List<? extends Number> a2=a1;
	
	
	// but this is not possible thought number is parent of integer to overcome this issue we can use wildcards
//	List<Integer> le=List.of();
//	List<Number> li=le;  // CE
	
	
	
	

	
}
}
