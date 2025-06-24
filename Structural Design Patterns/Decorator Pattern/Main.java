import coffees.Coffee;

import coffees.categories.Espresso;
import coffees.categories.Latte;

import coffees.decorator.Decorator;

import coffees.decorator.categories.MilkDecorator;
import coffees.decorator.categories.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee latte = new Latte(), espresso = new Espresso();

        Decorator milkDecorator = MilkDecorator.getDecorator();
        Decorator sugarDecorator = SugarDecorator.getDecorator();

        Coffee[] coffees = { latte, espresso };
        String[] names = { "Latte", "Espresso" };

        for (int i = 0; i < 2; i++) {
            System.out.println("For " + names[i]);
            System.out.println(coffees[i].getPrice());
            System.out.println(coffees[i].getIng());
            
            // Decorate with Milk
            milkDecorator.addValue(coffees[i]);
            System.out.println(coffees[i].getPrice());
            System.out.println(coffees[i].getIng());
            
            // Decorate with Sugar
            sugarDecorator.addValue(coffees[i]);
            System.out.println(coffees[i].getPrice());
            System.out.println(coffees[i].getIng());
        }
    }
}