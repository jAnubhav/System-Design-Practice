package processing;

import strategies.Strategy;

public class PaymentProcessing {
    private Strategy strategy;

    public PaymentProcessing(Strategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment() {
        strategy.processPayment();
    }

    public void setStrategy(Strategy newStrategy) {
        this.strategy = newStrategy;
    }
}
