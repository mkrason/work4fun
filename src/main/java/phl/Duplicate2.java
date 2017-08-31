package phl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.collections4.CollectionUtils;

public class Duplicate2 {

	 public List<Animal> deleteDuplicate2 (List<Animal> list1, List<Animal>list2){
	 List<Animal> deleteDupli = CollectionUtils.<Animal>collate(list1, list2, false);
	 return deleteDupli;
	 }
	 
	 public List<Animal> deleteDuplicateBySet (List<Animal> list1, List<Animal>list2){

		  Set<Animal > set1 = new HashSet<Animal>(list1);
		  Set<Animal > set2 = new HashSet<Animal>(list2);
		  
		  set1.addAll(set2);
		  
		  List<Animal> result = new ArrayList<>(set1);

		  return result;
	 }

	public List<Animal> deleteDuplicateStream(List<Animal> list1, List<Animal> list2) {
		List<Animal> result = Stream.concat(list1.stream(), list2.stream())
									.distinct()
									.collect(Collectors.toList());
		return result;
	}

}
