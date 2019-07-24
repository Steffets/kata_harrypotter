package kata.harrypotter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookingSystemImpl implements BookingSystem {

	@Override
	public double getPrice(int... books) {
		if (books == null) {
			return 0d;
		}
		List<Book> bookList = Arrays.stream(books).mapToObj(band -> new Book(band)).collect(Collectors.toList());
		List<Bookset> booksets = arrangeBooksToBookSets(bookList);
		return calculateSets(booksets);
	}

	private double calculateSets(List<Bookset> booksets) {
		double price = 0d;
		for (Bookset bookset : booksets) {
			price += bookset.getSetPrice();
		}
		return price;
	}

	private List<Bookset> arrangeBooksToBookSets(List<Book> books) {
		List<Bookset> booksets = new ArrayList<>();
		for (Book book : books) {
			double benefit = 0;
			Bookset winningBookset = null;
			for (Bookset set : booksets) {
				double benefitSet = set.getBenefit(book);
				if (benefitSet > 0 && benefitSet > benefit) {
					benefit = benefitSet;
					winningBookset = set;
				}
			}
			if (winningBookset == null) {
				Bookset bookset = new Bookset();
				bookset.addBook(book);
				booksets.add(bookset);
			} else {
				winningBookset.addBook(book);
			}
		}
		return booksets;
	}
}
