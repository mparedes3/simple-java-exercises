import java.util.ArrayList;
import java.util.List;

public class CardCollection {

    private String owner;
    private ArrayList<Card> myCollection;

    CardCollection(String owner){
        this.owner = owner;
        this.myCollection = new ArrayList<Card>();
    }

    public boolean addCard(Card card){
        for (int i = 0; i < myCollection.size(); i++){
            if (myCollection.get(i).compareTo(card) == 0)
                return false;
            else if (myCollection.get(i).compareTo(card) == 1){
                myCollection.add(i, card);
                return true;
            }
        }

        myCollection.add(card);
        return true;
    }

    public void removeCard(int i){ myCollection.remove(i); }

    public int getSize(){ return myCollection.size(); }

    public ArrayList<Card> mergeCollections(CardCollection cardCollection){
        ArrayList<Card> newCollection = new ArrayList<Card>();
        for (int i = 0; i < cardCollection.myCollection.size(); i++){
            if (addCard(cardCollection.myCollection.get(i)))
                cardCollection.myCollection.remove(i);
            else
                newCollection.add(cardCollection.myCollection.remove(i));
        }
        return newCollection;
    }

    public String toString(){
        String str = String.format("%s \n -----\n", owner);
        for (int i = 0; i < myCollection.size(); i++){
            str += String.format("%s\n", myCollection.get(i).toString());
        }
        return str;
    }
}
