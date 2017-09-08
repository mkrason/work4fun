package JUnit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import phl.Animal;
import phl.AnimalByName;
import phl.Cat;
import phl.Dog;

public class TestSortList {

	@Test
	public void testMySortList() {

		List<Animal> animals = new ArrayList<>();

		Cat cat1 = new Cat("Filemon", "meow", 10);
		Cat cat2 = new Cat("Latek", "meoww", 20);
		Cat cat3 = new Cat("Bonifacy", "meowww", 30);

		Dog dog1 = new Dog("Burek", "wow", 11);
		Dog dog2 = new Dog("Kajtek", "woww", 22);
		Dog dog3 = new Dog("Dyzio", "wowww", 33);

		animals.add(cat1);
		animals.add(cat2);
		animals.add(cat3);

		animals.add(dog1);
		animals.add(dog2);
		animals.add(dog3);
//		animals.add(null);

		AnimalByName.sortAnimalByName(animals);

	}

}
