package main;

import java.util.List;

public class Main {
public static void main(String[] args) {
	System.out.println("Streams are lazy in nature unless it called terminal operation it doesnt going to process the data");
System.out.println("streams are no gonna process the data in order sequence");
System.out.println("assume i have one list of integer and process throuh filter map then sort so now ");
System.out.println("first the first element will be filter and map also applies then the second element go for filter");
System.out.println("this feature helps in fast processing like:");

List<Integer> l=List.of(1,2,3,4);
l.stream().filter(a->a>0).peek(s->System.out.println("filter apply"+ s)).map(k->k).peek(k->System.out.println("map "+k)).limit(1).forEach(System.out::println);


System.out.println("for above one filter and map apply for firstb then we appply limit to one so it will no gonna apply filter and map for remaining elements");
}
}
