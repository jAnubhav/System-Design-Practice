package bidders;

import mediators.Mediator;

public class Bidder {
    private String name; private Mediator mediator;

    public Bidder(String name, Mediator mediator) { 
        this.name = name; this.mediator = mediator; mediator.register(this);
    }

    public void placeBid(int amount) { mediator.placeBid(amount, this); }

    public void recieveBid(int amount, Bidder bidder) {
        System.out.format("%s: Bidder %s bidded %d\n", name, bidder.name, amount);
    }
}
