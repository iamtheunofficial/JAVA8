package flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}



public class One {
	
public static void main(String[] args) {
	System.out.println("flatmap");
	System.out.println("it return the streams of data ");
	System.out.println("used when to process streams of collections");
	List<List<Integer>> list=List.of(List.of(1,2),List.of(3,2),List.of(4,2));
	
	List<Integer> l=list.stream().flatMap(k->k.stream()).collect(Collectors.toList());
System.out.println(l);


List<String> l1=List.of("abc","cde");
List<String> l3=List.of("bc","de");
List<String> l4=List.of("ac","ce");



List<List<String>> flat=List.of(l3,l1,l4);
List<String> res=flat.stream().flatMap(Collection::stream).filter(k->k.contains("c")).collect(Collectors.toList());
System.out.println(res);

List<Integer> l2=list.stream().flatMap(k->k.stream().map(i->i*2)).collect(Collectors.toList());
System.out.println(l2);


List<Person> p1=List.of(new Person("vishwa", 22),new Person("bishwa", 20),new Person("vishwa", 25));
List<Person> p2=List.of(new Person("cishwa", 19),new Person("dishwa", 24),new Person("vishwa", 18));

List<List<Person>>personList=List.of(p1,p2);
personList.stream().flatMap(Collection::stream).filter(k->k.age>20).map(k->k.name).forEach(System.out::println);;
}
}
