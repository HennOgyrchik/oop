import java.util.Comparator;

public class FoodComparator implements Comparator<Food> {

    @Override
    public int compare(Food o1, Food o2) {
        if (o1.weight>o2.weight) {
            return 1;
        }
        else {
            if (o1.weight<o2.weight) return -1;
        }
        return 0;
    }
}

