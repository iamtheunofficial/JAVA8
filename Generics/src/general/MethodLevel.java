package general;

import java.util.List;

class Demo<T>{
	
	
	 //if type paramter are diff from class type param so it will be no cinstraint while calling this method
	public <U> void one(U t) {
		System.out.println(t);
	}
	
	// here we can call this method of object of only Demo<T> means if object is demo<Integer> we should pass only integer
	public  void Two(T t) {
		System.out.println(t);
	}
	public static <T>  void get(T t) {  
		System.out.println(t);
	}
	
	public static <U extends Number>  void T(List<U> t) {
//		t.add(1)  //errror
		t.add(null);// only null insertion possible
		System.out.println(t);
	}
}





public class MethodLevel {
public static void main(String[] args) {
	System.out.println("we should apply <T> before return type then the method will be treated as generic method");
System.out.println("without that it will be treated as regular method but if we make class as generic then we can use that as argument in the method");
System.out.println("for static method we should mandatory mention <T> for instance if in class level  is generic then its fine for that methods");


System.out.println("Note: ");
System.out.println("for dtatic method to make generic we should mention mention generic type before return type and inside method");
System.out.println("for non static method if we make class as generic and we can pass that type inside method to it will be treated as generic and we should mandatoryly pass the same object type created while calling that instance method");
System.out.println(" for instance method if we write type aram before return type then class type param is overiden for that method so we can pass any type there will be no dependent on object type");


Demo.<Integer>get(1);  // demo.get(3)   boith is same
Demo<Number> d2=new Demo<>();
d2.one(null);
d2.Two(2f);
d2.Two(1L);



}
}
