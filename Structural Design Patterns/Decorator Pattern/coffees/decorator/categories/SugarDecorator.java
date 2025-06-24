package coffees.decorator.categories;

import coffees.Coffee;
import coffees.decorator.Decorator;

public class SugarDecorator implements Decorator {
    private static SugarDecorator decorator;

    private SugarDecorator() { 
        System.out.println("Setting up the Sugar Decorator.");
    }

    public static SugarDecorator getDecorator() {
        if (decorator == null) {
            decorator = new SugarDecorator();
        }

        return decorator;
    }

    public void addValue(Coffee coffee) {
        coffee.addIng("Sugar");
        coffee.setPrice(coffee.getPrice() + 5);
    }
}