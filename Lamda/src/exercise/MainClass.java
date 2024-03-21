package exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("vishwa", "Bm"), new Person("puni", "Bm"),
				new Person("vishwa", "Ak")

		);

		// sort based on last name using inner class

		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());

			}
		});

		System.out.println("sort on last name");

		printPersonOnConditions(persons, s -> true);

		System.out.println("sort on first name");

		// sort by first name using lambda expression
		Collections.sort(persons, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		// pring all persons using lambda
		printPersonOnConditions(persons, s -> true);

		System.out.println("persons using last name start with B");
		printPersonOnConditions(persons, new Condition() {

			@Override
			public boolean test(Person p) {

				return p.getLastName().startsWith("B");
			}
		});

		// getting only last name with a using predicate interface
		System.out.println("persons using last name start with A using predicate");

		printPersonOnPredicate(persons, s -> s.getLastName().startsWith("A"));

		// getting only last name with a using predicate,Consumer interface
		System.out.println("persons using last name start with A using predicate and consumer");

		printPersonOnPredicateAndConsumer(persons, s -> s.getLastName().startsWith("A"),
				p -> System.out.println(p.getLastName()));

	}

	private static void printPersonOnConditions(List<Person> persons, Condition condition) {

		for (Person k : persons) {
			if (condition.test(k)) {
				System.out.println(k);
			}
		}
	}

	// using inbuilt predicate interface for condition check instead of creating
	// extra condition interfaces
	private static void printPersonOnPredicate(List<Person> persons, Predicate<Person> predicate) {

		for (Person k : persons) {
			if (predicate.test(k)) {
				System.out.println(k);
			}
		}
	}

	private static void printPersonOnPredicateAndConsumer(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {

		for (Person k : persons) {
			if (predicate.test(k)) {
				consumer.accept(k);
			}
		}
	}
}

interface Condition {
	boolean test(Person person);
}
