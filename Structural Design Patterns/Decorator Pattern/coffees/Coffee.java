package coffees;

import java.util.ArrayList;
import java.util.List;

public abstract class Coffee {
    private int price; List<String> ing;

    public Coffee(int price) {
        this.price = price; ing = new ArrayList<>();
    }

    public int getPrice() { return price; }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getIng() { return ing; }

    public void addIng(String value) {
        ing.add(value);
    }
}