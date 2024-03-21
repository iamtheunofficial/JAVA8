package sorted;

import java.util.Arrays;

public class One {
public static void main(String[] args) {
	Integer[] a= {1,2,3,4};
	
	Arrays.stream(a).sorted().forEach(System.out::println);
	Arrays.stream(a).sorted((x,y)->y-x).forEach(System.out::println);
}
}
