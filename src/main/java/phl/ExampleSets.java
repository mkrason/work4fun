package phl;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExampleSets {

	public static void foreachMySet(Set<Animal> set1) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ My foreach iterator $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for (Animal animal : set1) {
			System.out.println(animal);
		}
	}

	public static void iteratorMySet(Set<Animal> set1) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ My iterator $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Iterator<Animal> animalIterator = set1.iterator();
		while (animalIterator.hasNext()) {
			Animal animal = animalIterator.next();
			System.out.println(animal);
		}
	}

	public static void sortMySet(Set<Animal> set1) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ sort TreeSet $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		TreeSet<Animal> sortedSet = new TreeSet<Animal>(set1);
		for (Animal animalSort : sortedSet) {
			System.out.println(animalSort);
		}
	}

}
