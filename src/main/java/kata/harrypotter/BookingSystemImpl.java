package kata.harrypotter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookingSystemImpl implements BookingSystem {

	@Override
	public double getPrice(int... books) {
		if(books == null) {
			return 0;
		}


		List<Integer> remainingBooks = new ArrayList<>();
		for (int i : books) {
			remainingBooks.add(i);
		}

		double preis = 0;
		List<Set<Integer>> bookSets = extractSets(remainingBooks);
		for (Set<Integer> set : bookSets) {
			preis += calculatePriceForSet(set.size());
		}
		return preis;

	}

	double calculatePriceForSet(int count) {
		switch( count) {
			case 1:
				return 8;
			case 2:
				return 2 * 8 * 0.95;
			case 3:
				return 3 * 8 * 0.90;
			case 4:
				return 4 * 8 * 0.8;
			case 5:
				return 5 * 8 * 0.75;
			default: return 0;
		}
	}

	private List<Set<Integer>> extractSets(List<Integer> remainingBooks) {
		List<Set<Integer>> listOfSets = new ArrayList<>();
		remainingBooks.sort(Integer::compareTo);
		for (Integer book: remainingBooks) {
			listOfSets.sort((o1, o2) -> Integer.compare(o1.size(), o2.size()));
			boolean found = false;
			for(Set<Integer> set : listOfSets) {
				if (!set.contains(book)) {
					set.add(book);
					found =true;
					break;
				}
			}
			if (!found){
				Set<Integer> newSet = new HashSet<>();
				newSet.add(book);
				listOfSets.add(newSet);
			}
		}

		return listOfSets;
	}

	private void removeFromListAndAddToSetIfContains(List<Integer> books, Set<Integer> set, Integer band) {
		if (books.contains(band)) {
			books.remove(band);
			set.add(band);
		}
	}

}
