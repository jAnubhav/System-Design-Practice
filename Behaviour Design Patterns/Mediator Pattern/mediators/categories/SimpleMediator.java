package mediators.categories;

import java.util.ArrayList;
import java.util.List;

import bidders.Bidder;

import mediators.Mediator;

public class SimpleMediator implements Mediator {
    private List<Bidder> bidders;
    
    public SimpleMediator() { this.bidders = new ArrayList<>(); }

    @Override
    public void register(Bidder bidder) { bidders.add(bidder); }

    @Override
    public void placeBid(int amount, Bidder bidder) {
        // Do some task of Logging and Registering
        notifyBidders(amount, bidder);
    }

    private void notifyBidders(int amount, Bidder bidder) {
        for (Bidder bid : bidders) {
            if (bid != bidder) bid.recieveBid(amount, bidder);
        }
    }
}
