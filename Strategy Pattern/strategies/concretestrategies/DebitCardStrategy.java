package strategies.concretestrategies;

import strategies.Strategy;

public class DebitCardStrategy implements Strategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment using Debit Card.");
    }
}
