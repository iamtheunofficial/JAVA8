package general;

import java.util.Objects;

class Demo1<T extends Number >{
	
	
	public void get(Demo1<T> t) {
		System.out.println(t);
	}

	
	public void get(T t) {
		System.out.println(t);
	}
	
	/// here while calling this method we pass only string object it will not bother class type parameter it will neglect
	public <T extends String>void get1(T t) {
		System.out.println(t);
	}
	@Override
	public String toString() {
		return "Demo1 []";
	}
	
	public static <U> void g(U u) {
		System.out.println(u);
	}
	
}



class A1<T1>{
	
	void add(T1 t) {
		System.out.println(t);
	}
}

interface B<T2>{
	void dis(T2 t);
}

class C<T> extends A1<T> implements B<T>{
	@Override
	public void dis(T t) {
System.out.println(t);		
	}
	
}

public class Inheritence {
	public static void main(String[] args) {
		
		System.out.println("we can pass any  type of type arguments if its alone like only T get(T t)  ");
		System.out.println("but it is specific means like( b<number>) we hould only b<number> object only we cant pass b<integer> or any subclass of number ");
		System.out.println("if we have same type paramter in class and method then method will be picked");
		
		System.out.println("while executing the methods there is no need to explicity mentioning the type arguments on calling methods like demo.<Integer>g(2)");
		System.out.println("the compiler will the infer the type of arguments passed in the method so no need to mention extrenallu");
		Demo1<Number> d=new Demo1<>();
		Demo1<Integer> d2=new Demo1<>();
//		Demo1<String> d3=new Demo1<>();
		
		
//		Demo1<Number> d=new Demo1<Integer>();  invalid syntax   it is not possible

//
		d.get(d);
		
//		we cant pass demo1<number> to demo1<Integer>
//		d.get(d2); // error
//		d.get(d3);// error
		
		d.get(2);
		d2.get1("");
		
		C<Integer> c1=new C<>();
		c1.dis(1);
		Demo1.<Integer>g(3); // type inference
		Demo1.g(2);  // both will same
		
	}

}
