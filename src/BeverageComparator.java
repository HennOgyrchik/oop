import java.util.Comparator;

public class BeverageComparator implements Comparator<Beverage> {

    @Override
    public int compare(Beverage o1, Beverage o2) {
        if (o1.getVolume()>o2.getVolume()) {
            return 1;
        }
        else {
            if (o1.getVolume()<o2.getVolume()) return -1;
        }
        return 0;
    }

}
