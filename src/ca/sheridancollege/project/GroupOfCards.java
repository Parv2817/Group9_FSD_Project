/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private final int size;//the size of the grouping

    /**
     * 
     *
     * @param size
        */
    public GroupOfCards(int size) {
        this.size = size;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getTopCard() {
        if (!cards.isEmpty()) {
            return cards.get(0);
        }
        return null;
    }
    
    public int getSize() {
        return cards.size();
    }

    public void clear() {
        cards.clear();
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
//    public ArrayList<Card> getCards() {
//        return cards;
//    }
//
//    /**
//     * @param size the max size for the group of cards
//     */
//    public void setSize(int size) {
//        this.size = size;
//    }

}//end class
