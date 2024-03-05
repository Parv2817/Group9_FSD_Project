/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player {

    private String name; //the unique name for this player
    private final GroupOfCards hand;
    
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     * @param hand
        */
    
    public Player(String name, GroupOfCards hand) {
        this.name = name;
        this.hand = hand;
    }

//    public Player(String name) {
//        this.name = name;
//        hand = new GroupOfCards(2);
//    }
//
    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public GroupOfCards getHand() {
        return hand;
    }

    public void addToHand(Card card) {
        hand.addCard(card);
    }

    public void clearHand() {
        hand.clear();
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();

}
