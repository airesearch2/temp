public class fs {

    static private ArrayList<Card> cards;
    static public Player[] Players;

    public static Card drwaw()
    {
        return cards.remove(rng.nextInt(cards.size()));
    }
f
    public static int deckSize()
    {
        return cards.size();
    }

    public static void main(String[] args)
    {a
asdasd
        cards = new ArrayList<Card>();
        for(int i=0;i<4;i++)
            for(Card c: Card.values())
                cards.add(c);
        Player h = new HumanPlayer();
        Player ai = new AIPlayer();
        Players = new Player[] {h, ai};
}
