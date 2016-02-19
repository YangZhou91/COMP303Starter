package ca.mcgill.comp303.exercise02.countryexample;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer>
{
	private int aStart, aEnd;

	public Range(int start, int end)
	{
		this.aStart = start;
		this.aEnd = end;
	}

	@Override
	public Iterator<Integer> iterator()
	{
		return new RangeIterator();
	}

	private class RangeIterator implements Iterator<Integer>
	{
		private int cursor;

		public RangeIterator()
		{
			this.cursor = Range.this.aStart;
		}

		@Override
		public boolean hasNext()
		{
			return this.cursor < Range.this.aEnd;
		}

		@Override
		public Integer next()
		{
			if (this.hasNext())
			{
				int current = cursor;
				cursor++;
				return current;
			}
			throw new NoSuchElementException();
		}

		@Override
		public void remove()
		{
			throw new UnsupportedOperationException();
		}

	}

	public static void main(String[] args)
	{
		Range range = new Range(0, 10);
		for (Integer integer : range)
		{
			System.out.println(integer);
		}

	}

}
