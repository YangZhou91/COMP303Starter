package ca.mcgill.comp303.exercise01;

public class Card
{

	Rank aRank;
	Suit aSuit;

	/**
	 * The all rank of card.
	 * 
	 * @author Yang Zhou(260401719)
	 *
	 */
	public enum Rank
	{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	/**
	 * The all Suit of a deck of card.
	 * 
	 * @author Yang Zhou(260401719)
	 *
	 */
	public enum Suit
	{
		CLUB, DIAMOND, HEART, SPADE
	}

	/**
	 * The constructor of Card.
	 * 
	 * @param pSuit
	 *            the suit of a card
	 * @param pRank
	 *            the rank of a card
	 */
	public Card(Suit pSuit, Rank pRank)
	{
		this.aSuit = pSuit;
		this.aRank = pRank;
	}
}
