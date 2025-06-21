package strategies.concretestrategies;

import strategies.Strategy;

public class CreditCardStrategy implements Strategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment using Credit Card.");
    }
}
