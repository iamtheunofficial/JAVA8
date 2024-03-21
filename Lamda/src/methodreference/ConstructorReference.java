package methodreference;

interface One{
	
	ConstructorReference get();
}

public class ConstructorReference {
int age;
	public ConstructorReference(int age) {
		this.age=age;
	}
	 public ConstructorReference() {
	}
	public static void main(String[] args) {
		System.out.println("constructor reference");
		
		System.out.println(" the nos of input in interface should be match in refefrence consturctor class");
		
		// constructor reference
		One one=ConstructorReference::new;
		ConstructorReference ref=one.get();
		System.out.println(ref.age);
		
		
	}
}
