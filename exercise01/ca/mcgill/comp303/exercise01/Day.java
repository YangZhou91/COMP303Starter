package ca.mcgill.comp303.exercise01;

public class Day
{

	public int year;
	public int month;
	public int date;

	private static final int[] DAYS_PER_MONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private static final int GREGORIAN_START_YEAR = 1582;
	private static final int GREGORIAN_START_MONTH = 10;
	private static final int GREGORIAN_START_DAY = 15;
	private static final int JULIAN_END_DAY = 4;
	private static final int JANUARY = 1;
	private static final int FEBRUARY = 2;
	private static final int DECEMBER = 12;

	public Day(int aYear, int aMonth, int aDate)
	{
		this.year = aYear;
		this.month = aMonth;
		this.date = aDate;
	}

	public int getYear()
	{
		return year;
	}

	public int getMonth()
	{
		return month;
	}

	public int getDate()
	{
		return date;
	}

	private static int daysPerMonth(int y, int m)
	{
		int days = DAYS_PER_MONTH[m - 1];
		if (m == FEBRUARY && isLeapYear(y))
			days++;
		return days;
	}

	private static boolean isLeapYear(int y)
	{
		if (y % 4 != 0)
			return false;
		if (y < GREGORIAN_START_YEAR)
			return true;
		return (y % 100 != 0) || (y % 400 == 0);
	}
}
