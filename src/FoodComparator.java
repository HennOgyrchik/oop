import java.util.Comparator;

public class FoodComparator implements Comparator<Product> {
//Принцип подстановки Барбары Лисков.
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice()>o2.getPrice()) {
            return 1;
        }
        else {
            if (o1.getPrice()<o2.getPrice()) return -1;
        }
        return 0;
    }
}

