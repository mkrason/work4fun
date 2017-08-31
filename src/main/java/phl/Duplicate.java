package phl;

import java.util.List;

public class Duplicate<E> {

	public List<E> deleteDuplicate(List<E> list1, List<E> list2) {

		for (int i = 0; i < list2.size(); i++) {

			if (!list1.contains(list2.get(i))) {
				list1.add(list2.get(i));
			}

		}

		return list1;

	}

}
