import java.util.ArrayList;
public class Deck
{
    ArrayList <Card> deck = new ArrayList <Card>();
    public static void Deck(){
        for(int i = 1; i<=13; i++){
            for(int x=0; x<=4; x++){
                Card card = new Card();
                Card.Rank = i;
                if(x==1){
                    card.Suit = "Heart";
                }
                if(x==2){
                    card.Suit = "Diamond";
                }
                if(x==3){
                    card.Suit = "Spade";
                }
                if(x==4){
                    card.Suit = "Club";
                }
                System.out.println(card);
            }
        }
    }
    
    public Card getCard(){
        Card.Rank = (int) Math.random()*13;
        int x = (int) Math.random()*4;
        if(x==1){
                 Card.Suit = "Heart";
                }
        if(x==2){
                 Card.Suit = "Diamond";
                }
        if(x==3){
                 Card.Suit = "Spade";
                }
        if(x==4){
                 Card.Suit = "Club";
                }
        //Card ReturnCard = (card.Rank,card.Suit);
        
        return Card(card.Rank)(card.Suit);
    }
    
    
}
