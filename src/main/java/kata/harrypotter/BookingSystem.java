package kata.harrypotter;

public interface BookingSystem {

	/**
	 * Ermittelt den bestmögliche Preis beim Kauf mehrerer Bänder
	 * @param books Die eimzelnen  bänder von 1-7 z.B:  1,3 = Band 1 und Band 3
	 * @return der bestmögliche Preis
	 */
	default double getPrice(int... books) {
		throw new IllegalStateException("not yet implemented");
	}
}
