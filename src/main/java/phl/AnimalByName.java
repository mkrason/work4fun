package phl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalByName {

	public static List<Animal> getAnimalByName(List<Animal> animals, String name) {
		List<Animal> result = animals.stream().filter(a -> a.getName().equals(name)).collect(Collectors.toList());
		return result;
	}

	public static void sortAnimalByName(List<Animal> animals) {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ sort list $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Collections.sort(animals);
		for (Animal animal : animals) {
			System.out.println(animal);
		}

	}

}
