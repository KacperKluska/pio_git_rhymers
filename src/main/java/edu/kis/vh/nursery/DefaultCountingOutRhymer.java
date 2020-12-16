package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int TOTAL = -1;
	public static final int NUMBERS = 12;
	public static final int CHECK = 11;
	private int[] numbers = new int[NUMBERS];

	public int total = TOTAL;

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