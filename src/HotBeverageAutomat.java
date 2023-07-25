import java.util.ArrayList;

public class HotBeverageAutomat extends Automat{
    ArrayList<HotBeverage> productList=new ArrayList<>();

    public void initProduct(ArrayList<HotBeverage> productList){
        this.productList=productList;
    }
  public HotBeverage getProduct(String name, double volume, int temperature) {
        for (HotBeverage prod :
                productList) {
            if (prod.getName().equals(name)&&prod.getTemperature()==temperature&&prod.getVolume()==volume) return  prod;

        }
        return null;
    }
}
