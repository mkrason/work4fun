package phl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.CollectionUtils;

public class Duplicate2 {

	 public List<Animal> deleteDuplicate2 (List<Animal> list1, List<Animal>
	 list2){
	 List<Animal> deleteDupli = CollectionUtils.<Animal>collate(list1, list2, false);
	 return deleteDupli;
	 }

	public List<Animal> deleteDuplicateStream(List<Animal> list1, List<Animal> list2) {
		List<Animal> result = Stream.concat(list1.stream(), list2.stream())
									.distinct()
									.collect(Collectors.toList());
		return result;
	}

}
