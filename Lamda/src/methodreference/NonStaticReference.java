package methodreference;


interface Person1{
//	void age();
	int run(int x);
}

class Student1{
	public  int get(int age) {
		System.out.println("age is "+ age);
		return 0;

	}
	
	public static void greet() {
		System.out.println("hello");
	}
	
	
}

public class NonStaticReference {
public static void main(String[] args) {  
	
	System.out.println("non-static method reference");
	System.out.println("refering the interface instace to the non static method of other class with their object reference");
	System.out.println("the method should match the inteface signature ");
	System.out.println("but if interface methid return void but reference methid return something means it works but vice versa will result in compialtion error");
	
	// non-static method reference
	Student1 std=new Student1();
	Person1 p=std::get;
	p.run(2);
	
	
}
}
