import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> hotDrink = new ArrayList<>();
        hotDrink.add(new HotDrink("Tea", 120 , 80));
        hotDrink.add(new HotDrink("Coffee", 200, 90));
        hotDrink.add(new HotDrink("Irish Coffee", 400,95));
        hotDrink.add(new HotDrink("Bubble Tea", 350 , 75));

        System.out.println(hotDrink);

        HotDrinksVendingMachine hotDr = new HotDrinksVendingMachine();
        hotDr.initsProduct(hotDrink);
        System.out.println(hotDr.getProduct("Tea", 80));
    }
}