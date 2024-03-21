package primitive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class One {
public static void main(String[] args) {
	
	String[] s= {"1","22","3"};
	
	
	// INtStream  : to work with primitive  int type  :maptoint 
	// longStream  : to work with primitive  long type: maptolong
	// doubleStream  : to work with primitive  double type:maptodouble

	
	
//	maptoint  : convert stream of object to primitive like intstream
IntStream i=Arrays.stream(s).mapToInt(a->Integer.valueOf(a));

int[] arr=i.toArray();
//
Arrays.stream(arr).filter(a->a>2).map(b->b*2).forEach(System.out::println);




}
}
