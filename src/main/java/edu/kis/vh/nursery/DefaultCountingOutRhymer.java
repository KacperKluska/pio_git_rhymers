package edu.kis.vh.nursery;

/**
 * The type Default counting out rhymer.
 */
public class DefaultCountingOutRhymer {

	private static final int TOTAL = -1;
	private static final int NUMBERS = 12;
	private static final int CHECK = NUMBERS - 1;
	private final int[] numbers = new int[NUMBERS];

	private int total = TOTAL;

	/**
	 * Count in.
	 *
	 * @param in the in
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Call check boolean.
	 *
	 * @return the boolean
	 */
	public boolean callCheck() {
		return total == TOTAL;
	}

	/**
	 * Is full boolean.
	 *
	 * @return the boolean
	 */
	public boolean isFull() {
		return total == CHECK;
	}

	/**
	 * Peekaboo int.
	 *
	 * @return the int
	 */
	protected int peekaboo() {
		if (callCheck())
			return TOTAL;
		return numbers[total];
	}

	/**
	 * Count out int.
	 *
	 * @return the int
	 */
	public int countOut() {
		if (callCheck())
			return TOTAL;
		return numbers[total--];
	}

	/**
	 * Gets total.
	 *
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
}