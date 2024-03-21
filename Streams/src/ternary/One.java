package ternary;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class One {
public static void main(String[] args) {
	List<Integer> list=List.of(1,0,2,3,4,1);
	
//count
	
	long nos=list.stream().count();
	System.out.println(nos);
	
	
// for-Each
	list.stream().forEach(System.out::println);
	
	
	
//max : return the last element of sorted order of comparator
	Optional<Integer> o=list.stream().max((a,b)->a-b);
	Optional<Integer> o2=list.stream().max(Integer::compareTo);

	Optional<Integer> o3=list.stream().max((a,b)->b-a);  // return last element

	
	System.out.println(o.get());
	System.out.println(o2.get());
	System.out.println(o3.get());
	
	System.out.println();
	
	
	//min  : return first element of sorted order of comparator
	
	Optional<Integer> i1=list.stream().min((a,b)->a-b);
	Optional<Integer> i2=list.stream().min((a,b)->b-a);

	System.out.println(i1.get());
	System.out.println(i2.get());
	
// toarray
	

	
	//list to array
	Object[] objarr=list.stream().toArray();
	
	
	// intstream to array
	int[] arr=list.stream().mapToInt(k->k).toArray();
	
			
	String[] obj=list.stream().map(k->k.toString()).toArray(String[]::new);
	
	System.out.println(Arrays.toString(obj));
	
	// list to Integer array
	Integer[] re=list.stream().toArray(Integer[]::new);
	
	
   //	int[] to Integer array
	
	//boxed is uded to convert primitve to stream of object like Intstream to stream of integer
	Integer[] in=Arrays.stream(arr).boxed().toArray(Integer[]::new);
	
	
//reduce
	// it takes binaryoperator(t,t) return t
	// it is continuous associative aggregative function
//	like {1,2,3,4} if i use reduce with (a,b)->a+b;
//	steps are 1+2->3
//	3+3->4
//	4+4->8
	Optional<Integer> op=list.stream().reduce((a,b)->a+b);
	Optional<Integer> op2=list.stream().reduce(Integer::max);

	System.out.println(op.get());
	System.out.println(op2.get());
	
	
	// here first arg is start with that no for performation 
	Integer o1=list.stream().reduce(1, (s1,s2)->s1+s2);
	System.out.println(o1);
	
	
//anymatch
	boolean b=list.stream().anyMatch(s->s>10);
	System.out.println(b);
	
//allmatch
	boolean b2=list.stream().allMatch(s->s>=0);
	System.out.println(b2);
	
//nonematch
	boolean b3=list.stream().noneMatch(s->s>3);
	System.out.println(b3);
	
	
	int n=list.stream().filter(s->s>0).findFirst().get();
	System.out.println(n);
	
	
	int n2=list.stream().filter(s->s>0).findAny().get();
	System.out.println(n2);

	
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

     // Using a Consumer to modify values within the stream
   list.stream().peek(s->
 
   {s=s*2;
   System.out.println("ee");}
   )
   .forEach(System.out::println);
   
   
   
// collect
   
   // collecting as list
   List<Integer> l=list.stream().filter(k->k>1).collect(Collectors.toList());
   
   // collecting as set
   Set<Integer> l2=list.stream().filter(k->k>1).collect(Collectors.toSet());
    
   // collecting as string concatenation   :joining
   
  String a=list.stream().filter(k->k>1).map(k->k.toString()).collect(Collectors.joining(""));
  System.out.println(a);
  
  
  // collecting as map
  Map<Integer,String> l3=List.of("a","ab","abc").stream().collect(Collectors.toMap(k->k.length(), v->v));
System.out.println(l3);

// colecting as map by grouping
Map<Integer,List<String>> l4=List.of("a","ab","ab","f").stream().collect(Collectors.groupingBy(k->k.length()));

System.out.println(l4);


}
}
