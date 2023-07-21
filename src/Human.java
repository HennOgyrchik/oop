import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Human extends Actor implements ActorBehavoir{
    private double money;
    private Automat nearestAutomat;
public Human (String name, double money){
    super(name);
    this.money=money;
}

    @Override
    public void setMakeOrder(boolean flag) {

    }

    @Override
    public void setTakeOrder(boolean flag) {

    }

    @Override
    public boolean isMakeOrder() {
        return this.isMakeOrder();
    }

    @Override
    public boolean isTakeOrder() {
        return this.isTakeOrder();
    }

    public Order makeOrder(ArrayList<String> deList) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shopProduct;
        for (String nameProduct : deList) {
            shopProduct=nearestAutomat.getProduct(nameProduct);
            if (shopProduct!=null){
                shoppingList.add(shopProduct);
            }
        }

        setMakeOrder(true);


        return nearestAutomat.createOrder(shoppingList);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setNearestAutomat(Automat automat) {
        this.nearestAutomat= automat;

    }

    @Override
    public String toString() {
        return getName();
    }
}
