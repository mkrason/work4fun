package JUnit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import phl.Animal;
import phl.Cat;
import phl.Dog;
import phl.Duplicate2;

public class Test3_v2 {

	@Test
	public void test3deleteDuplicate() {

		Duplicate2 duplicate2 = new Duplicate2();

		List<Animal> animals1 = new ArrayList<>();
		List<Animal> animals2 = new ArrayList<>();

		Cat cat1 = new Cat("Filemon", "meow", 10);
		Cat cat2 = new Cat("Latek", "meoww", 20);
		Cat cat3 = new Cat("Bonifacy", "meowww", 30);

		Dog dog1 = new Dog("Burek", "wow", 11);
		Dog dog2 = new Dog("Kajtek", "woww", 22);
		Dog dog3 = new Dog("Dyzio", "wowww", 33);

		animals1.add(cat1);
		animals1.add(cat2);
		animals1.add(cat3);
		animals1.add(cat3);

		animals2.add(dog1);
		animals2.add(dog2);
		animals2.add(dog3);
		animals2.add(dog3);
		animals2.add(cat1);
		animals2.add(cat2);
		animals2.add(cat2);

//		List<Animal> animals1 = duplicate2.deleteDuplicate2(animals1, animals2);

		List<Animal> animalsBySet = duplicate2.deleteDuplicateBySet(animals1, animals2);
		
		List<Animal> animals = duplicate2.deleteDuplicateStream(animals1, animals2);

		assertEquals(6, animalsBySet.size());
		assertEquals(6, animals.size());

	}

}
