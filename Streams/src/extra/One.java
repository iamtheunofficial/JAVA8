package extra;

import java.util.List;
import java.util.Objects;


class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object o) {
		 if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        Person person = (Person) o;
	        return Objects.equals(name,person.name);
		
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(name);
    }
//	
	
}


public class One {
public static void main(String[] args) {
	List<Integer> l=List.of(1,2,3,4,1,2);
	
	// distinct   :  remove duplicates
	l.stream().distinct().forEach(System.out::println);
	
	List<Person> p1=List.of(new Person("vishwa", 22),new Person("bishwa", 20),new Person("vishwa", 25));

	
	// using for custom classs by overiding the equals method
	p1.stream().distinct().forEach(System.out::println);
	
	
	//limit   :limit the no of iteration to particular no
	System.out.println("limit");
	l.stream().limit(5).forEach(System.out::println);
	
	//skip :skip the starting input nos while processing
	System.out.println("skip");
	l.stream().skip(3).forEach(System.out::println);
	
	
	//peek :: it is intermediate just to see the object which are processing in streams
	System.out.println("peek");
	l.stream().filter(k->k%2==0).peek(k->System.out.println("  "+k)).map(k->k*2).count();
}
}
