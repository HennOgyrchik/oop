import java.util.Comparator;

public class HotBeverageComparator implements Comparator<HotBeverage> {

    @Override
    public int compare(HotBeverage o1, HotBeverage o2) {
        if (o1.getTemperature()>o2.getTemperature()) {
            return 1;
        }
        else {
            if (o1.getTemperature()<o2.getTemperature()) return -1;
        }
        return 0;
    }
}
