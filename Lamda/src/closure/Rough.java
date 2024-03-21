package closure;

import java.util.function.Consumer;

public class Rough {
public static void main(String[] args) {
	
	System.out.println("here a will be treated as final in lamdba expression we cant modify inside lambda");
	 int a=10;
	perform(s->
	{
	System.out.println(s+a);
	});

}

private static  void perform(Consumer<Integer>consumer) {
	consumer.accept(2);
}
	

}
