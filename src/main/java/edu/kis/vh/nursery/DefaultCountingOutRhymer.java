package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int TOTAL = -1;
	private static final int NUMBERS = 12;
	private static final int CHECK = 11;
	private int[] numbers = new int[NUMBERS];

	private int total = TOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == TOTAL;
	}

	public boolean isFull() {
		return total == CHECK;
	}

	protected int peekaboo() {
		if (callCheck())
			return TOTAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return TOTAL;
		return numbers[total--];
	}
}