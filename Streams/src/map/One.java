package map;

import java.util.List;


class Student {
	String name;
	int age;
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
}



public class One {
public static void main(String[] args) {
	
	System.out.println("in map it helps in transformation of object to other");
	List<String> list=List.of("ab","bbd","caaa","d");
	
	list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
	
	list.stream().map(s->s.length()).forEach(System.out::println);
	
	
	List<Student> std=List.of(new Student("vishwa",23),new Student("bishwa",13),new Student("cishwa",33));
	
	std.stream().filter(s->s.age>20).map(s->s.name.toUpperCase()).forEach(System.out::println);
}
}
