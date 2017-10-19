z
    abstract class Player
    {
        protected ArrayList<Card> hand = new ArrayList<Card>();
        private int numBooks;
d
        public Player()
        {
            for(int i=0;i<8;i++)w
                fish();
        }

        public boolean hasGiven(Card cType)
        {
            return hand.contains(cType);
        }

        public ArrayList<Card> giveAll(Card cType)
        {
//            ArrayList<Card> x = new ArrayList<Card>(); //Complicated because simply taking the cards as they
//            for(int i=0;i<hand.size();i++)            //are found would mess up the traversing of the hand
//                if (hand.get(i) == cType)
//                    x.add(hand.get(i));
//            for(int c=0;c<x.size();c++)
//                hand.remove(cType);
//            return x;
        }

        protected boolean askFor(Card cType)
        {
            int tmp = 0;
            if (this instanceof HumanPlayer)
                tmp = 1;
            Player other = GoFish.Players[tmp];

            //Used for the computer's strategy//
            if (tmp==1)
                ((AIPlayer) other).queries.add(cType);
            //                               //

            if (other.hasGiven(cType))
            {
                for(Card c: other.giveAll(cType))
                    hand.add(c);
                return true;
            }
            else
}
