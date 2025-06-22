import bidders.Bidder;

import mediators.Mediator;
import mediators.categories.SimpleMediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new SimpleMediator();
        
        Bidder bidder1 = new Bidder("A", mediator);
        Bidder bidder2 = new Bidder("B", mediator);
        Bidder bidder3 = new Bidder("C", mediator);

        bidder1.placeBid(100);
        bidder2.placeBid(200);
        bidder3.placeBid(300);
    }
}