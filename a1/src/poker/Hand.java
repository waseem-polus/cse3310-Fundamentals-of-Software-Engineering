package poker;

import java.lang.Exception;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Hand {
    // private transient int i=10;
    // marked transient they will not serialized / deserialized

    public Card[] cards;

    public Hand() {
    }

    public Hand(Card[] cards) throws Exception {
        if (cards.length != 5) {
            throw new Exception("There must be 5 cards in a hand (provided " + cards.length + " cards)");
        }

        for (int i = 0; i < 5; i++) {
            this.cards[i] = cards[i];
        }
    }

    public boolean is_better_than(Hand H) {
        return false;
    }

    public boolean is_equal(Hand H) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder hand = new StringBuilder();

        for (Card c : this.cards) {
            hand.append(c.toString() + "\n");
        }

        return hand.toString();
    }
}
