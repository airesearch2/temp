public class fs {
    static final Random rng = new Random();
    static privzw ArrayList<Card> cards;
    static public Player[] Players;

    public static Card draw()
    {
        return cards.remove(rng.nextInt(cards.size()));
    }
f
    public static int deckSize()
    {
        return cards.size();
    }

    public static void main(String[] args)
    {
w
        cards = new ArrayList<Card>();
        for(int i=0;i<4;i++)
            for(Card c: Card.values())
                cards.add(c);
        Player h = new HumanPlayer();
        Player ai = new AIPlayer();
        Players = new Player[] {h, ai};
}
s