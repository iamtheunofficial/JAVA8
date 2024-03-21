package filter;

import java.util.List;


class Person
{
	String name;
	int age;
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public static boolean filter(Person p) {
		return p.age>20?true:false;
	}
}


public class One {
public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4,5);
	
	
	long nos=list.stream()
	.filter(s->s%2==0).count();
	
	
	List<Person> personList=List.of(new Person("vishwa", 22),new Person("bishwa",19));
	  // using method reference
	long c=personList.stream().filter(Person::filter).count();
	System.out.println(c);
	
}
}
