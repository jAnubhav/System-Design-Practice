package coffees.decorator.categories;

import coffees.Coffee;
import coffees.decorator.Decorator;

public class MilkDecorator implements Decorator {
    private static MilkDecorator decorator;

    private MilkDecorator() {
        System.out.println("Setting up the Milk Decorator.");
    }

    public static MilkDecorator getDecorator() {
        if (decorator == null) {
            decorator = new MilkDecorator();
        }

        return decorator;
    }

    public void addValue(Coffee coffee) {
        coffee.addIng("Milk");
        coffee.setPrice(coffee.getPrice() + 2);
    }
}