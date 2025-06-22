package mediators;

import bidders.Bidder;

public interface Mediator {
    void register(Bidder bidder);
    void placeBid(int amount, Bidder bidder); 
}
