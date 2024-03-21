package excpetionhandling;

import java.util.function.BiConsumer;

public class MainClass {
	
public static void main(String[] args) {
	
	System.out.println("exception handling in lambda expression");
	int[] num=  {1,2,3};
	int key=0;
	
	
	// one way
	
	perform(key,num,(v,k)->
	{
		try {
			System.out.println(v/k);

		} catch (Exception e) {
System.out.println("exception occured");		}
	});

	perform(key,num,wrapper((v,k)->System.out.println(v/k)));
	
	
	

}


// 2nd way by wraaping
private static BiConsumer<Integer, Integer> wrapper(BiConsumer<Integer, Integer> consumer){
	return (v,k)->
	{
		try {
			consumer.accept(v, k);

		} catch (Exception e) {
System.out.println("exception handled by wrapper");		}
	};
}




private static void perform(int key, int[] num,BiConsumer<Integer, Integer> consumer) {

	for(int k:num) {
		consumer.accept(k, key);
	}

}
}
