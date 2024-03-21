package thisreference;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		System.out.println("in lamda expression we cant use this reference in static area");
		System.out.println("if we use this in instance method that wil be the instance of the outwer class only not that lambda instance ");
		
		System.out.println();
		Main main=new Main();

		perform(new Consumer<Integer>() {
			int a=2;
			@Override
			public void accept(Integer t) {
				System.out.println(this);    // this represent the inner class instsnce reference
System.out.println(t);				
			}
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
return "reference of inner classs"	;		}
		});
		
	main.run();
		
	}

	private static void perform(Consumer<Integer> consumer) {
		consumer.accept(1);
	}
	
	
	void check(Consumer<Integer> consumer)
	{consumer.accept(2);}	
	void run() {
		check(s->
		{System.out.println(s);
		System.out.println(this);  // this reference the outer class reference
			}
		);
		

}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "reference to main class";
	}
}
