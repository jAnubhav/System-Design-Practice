import processing.PaymentProcessing;

import strategies.concretestrategies.CreditCardStrategy;
import strategies.concretestrategies.DebitCardStrategy;
import strategies.concretestrategies.PayPalStrategy;

public class Main {
    public static void main(String[] args) {
        // Credit Card Processing
        PaymentProcessing processor = new PaymentProcessing(new CreditCardStrategy());
        processor.processPayment();

        // Debit Card Processing
        processor.setStrategy(new DebitCardStrategy());
        processor.processPayment();

        // PayPal Processing
        processor.setStrategy(new PayPalStrategy());
        processor.processPayment();
    }
}
