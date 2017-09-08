package JUnit;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import phl.Animal;
import phl.Cat;
import phl.Dog;
import phl.ExampleSets;

public class test5collections {

	@Test
	public void testSets() {

		Set<Animal> animals1 = new HashSet<>();
		// Set<Animal> animals1 = new TreeSet<>();

		Cat cat1 = new Cat("Filemon", "meow", 10);
		Cat cat2 = new Cat("Latek", "meoww", 20);
		Cat cat3 = new Cat("Bonifacy", "meowww", 30);

		Dog dog1 = new Dog("Burek", "wow", 11);
		Dog dog2 = new Dog("Kajtek", "woww", 22);
		Dog dog3 = new Dog("Dyzio", "wowww", 33);
		Dog dog4 = new Dog("Dyzio", "wowww", 33);

		animals1.add(cat1);
		animals1.add(cat2);
		animals1.add(cat3);
		animals1.add(cat3);
		animals1.add(dog1);
		animals1.add(dog2);
		animals1.add(dog3);
		animals1.add(dog3);
		animals1.add(dog4);
		animals1.add(cat1);
		animals1.add(cat2);
		animals1.add(cat2);
		animals1.add(new Dog("Dyzio", "wowww", 33));

		ExampleSets.sortMySet(animals1);

		animals1.add(null);
		animals1.add(null);

		ExampleSets.foreachMySet(animals1);
		ExampleSets.iteratorMySet(animals1);

	}

}
