package methodreference;

import java.util.List;

interface Person{
	void age(String age);
//	void run(int x);
}

class Student{
	public static int get(int age) {
		System.out.println("agde is "+ age);
		return 10;

	}
	
	public static int get2(int age) {
//		System.out.println("ag2 is "+ age);
		return 10;

	}
	
	
	public static void greet() {
		System.out.println("hello");
	}
	
	
}

public class StaticReference {
public static void main(String[] args) {  
	
	System.out.println("static method reference");
	System.out.println("refere the implenation for functional interface abstract method to other class static methods");
	System.out.println("while refereing there should have same parameter type and same nos of argumnets");
	System.out.println("in some cases if the interface does not return anything but the static refeecne return something also it works fine but vice versa leads to compialtion error");
		// static method reference
//	Person p=Student::get;
	
//	p.age();
	
	
	// ex 2:
	
	
	
}
}
