public class Card {
    private String suit;
    private int rank;

    public static final String DIAMOND = "Diamond";
    public static final String HEART = "Heart";
    public static final String SPADE = "Spade";
    public static final String CLUB = "Club";


    public Card(String s, int r) {
        suit = s;
        rank = r;
    }

    public String getSuit() {
        return suit;
    }

    public int getRank() {
        return rank;
    }

}
