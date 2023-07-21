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
        isMakeOrder=flag;
    }

    @Override
    public void setTakeOrder(boolean flag) {
        isTakeOrder=flag;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
    @Override
    public Order makeOrder(ArrayList<String> desiredProducts) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shopProduct;
        for (String nameProduct : desiredProducts) {
            shopProduct=nearestAutomat.getProduct(nameProduct);
            if (shopProduct!=null){
                shoppingList.add(shopProduct);
            }
        }

        setMakeOrder(true);


        return nearestAutomat.createOrder(shoppingList,this);
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
