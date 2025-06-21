package strategies.concretestrategies;

import strategies.Strategy;

public class PayPalStrategy implements Strategy {
    @Override
    public void processPayment() {
        System.out.println("Processing Payment using PayPal");
    }
}
