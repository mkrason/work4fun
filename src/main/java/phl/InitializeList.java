package phl;

import java.util.ArrayList;
import java.util.List;

public class InitializeList {
	
	 List<Integer> list1 = new ArrayList<Integer>(){{
         add(1);
         add(2);
	 }};
	 
	 public List<Integer> myList(){
	 List<Integer> list2 = new ArrayList<>();
	 list2.add(1);
	 list2.add(2);
	 return list2;
	 }
}
