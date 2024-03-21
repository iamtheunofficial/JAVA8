package one;


@FunctionalInterface
interface Greet {
	
//	public void greet();

	public String greet();
	
	public default void get() {}  // default method

}

public class Lamda1 {

	public static void msg(Greet g) {
		
		System.out.println(g.greet());
	}
	
	
	public static void main(String[] args) {
		System.out.println("Lambda");
		System.out.println("we can write lamba expression for only functional interfaces");
		System.out.println("with the help of lambda we can get an lambda instance of that interfcae");
		System.out.println("lambda expression are backward compatible like in threads how we used for runnbale interface");
		
		System.out.println("java8 give give some ibuilt interface whuichj is usefull for lambda creation in some scenarious like predicate,Consumer,supplier under java.util.function package");
		System.out.println("--------------------------------------------");
//		Greet msg1=()-> System.out.println("welcome");; 

		Greet msg=()->  "welcome from lambda";
		
			Greet msg2=new Greet() {   // using innerclass
				
				@Override
				public String greet() {
					// TODO Auto-generated method stub
					return "from ananomous";
				}
			};
		msg(msg);
		msg(msg2);
		msg(()->"from typereference");
		
		// creating thread using runnable interface by lamda expression 
		Thread t=new Thread(()->System.out.println("run method from lamda thread"));
t.start();



System.out.println("------------------------------");
System.out.println("Advantyages useage of lambdas");
System.out.println("enable functional programming so no need to create separtae class for functionallity ");
System.out.println("increase readability and concise code");
System.out.println("enable support for parallel processing using strams api");
	}
}
