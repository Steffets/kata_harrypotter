package kata.harrypotter;

public class Book {

	private int band;

	public Book(int band) {
		this.band = band;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			return band == ((Book)obj).band;
		}
		return false;
	}

}
