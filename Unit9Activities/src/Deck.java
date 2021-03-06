
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = ranks.length*suits.length;
		int counter = 0;
		cards = new ArrayList<Card>(size);
		for (int i = 0; i<ranks.length;i++){
			for (int j = 0; j<suits.length;j++){
				cards.add( new Card(ranks[i],suits[j],values[i]));
				counter++;
			}
		}
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (cards.size() == 0){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public String shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		int temp;
		int[]cardValues = new int[size];
		String newOutput = "";
		for(int i = 0; i < size; i++){
			cardValues[i] = i;
		}
		String output = "";
		int[]values =new int[size];
		for (int k = size-1; k > 1; k--){
			Random rand = new Random();
			int j= rand.nextInt(size);
			temp = cardValues[k];
			cardValues[k] = values[j];
			values[j]= temp;
			output = output + cards.get(j) + ", ";
			}
		size = cards.size();
		return "Shuffled Deck: " + output;
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size == 0){
			return null;
		}
		else{
			size = size-1;
			Card c = cards.get(size);
			return c;
		}
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		rtn = rtn + shuffle();
		rtn = rtn + "\n";
		return rtn;
	}
}
