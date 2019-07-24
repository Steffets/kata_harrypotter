package kata.harrypotter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bookset {

	private List<Book> books = new ArrayList<>();

	public boolean addBook(Book book) {
		if (!books.contains(book)) {
			return books.add(book);
		}
		return false;
	}

	public double getBenefit(Book book) {
		if (!books.contains(book)) {
			return (getDiscount(books.size() + 1) - getDiscount(books.size())) * (books.size() + 1);
		} else {
			return 0;
		}
	}

	public double getSetPrice() {
		return (1.0 - getDiscount(books.size())) * (books.size() * 8);
	}

	private double getDiscount(int size) {
		switch (size) {
			case 1: return 0;
			case 2: return 0.05;
			case 3: return 0.1;
			case 4: return 0.2;
			case 5: return 0.25;
			default: throw new IllegalStateException("two many books inside the set");
		}
	}

	public int getSize() {
		return books.size();
	}
}
