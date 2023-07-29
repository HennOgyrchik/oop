import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

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
    public Order<Product> makeOrder(ArrayList<String> desiredProducts) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        for (String nameProduct : desiredProducts) {
            shoppingList.add(nearestAutomat.getProduct(nameProduct));
        }

        setMakeOrder(true);

        return nearestAutomat.createOrder(shoppingList,this);
    }

    @Override
    public ArrayList<String> validateOrder(ArrayList<String> deList) {
       /* Добавить проверку в Order (validateOrder()) до оформления заказа:
        если заказано некоторого товара больше, чем есть в автомате,
        удалить этот товар из заказа (желательно в одну проходку)*/
        Map<String,Integer> temp=new HashMap<String,Integer>();

        for (String prodName : deList) {
            if (temp.containsKey(prodName)){
                temp.put(prodName, temp.get(prodName)+1);
            } else {
                temp.put(prodName,1);
            }
        }

        Product currentProd;
        for (String nameProduct : temp.keySet()) {
            currentProd=nearestAutomat.getProduct(nameProduct);
            if (currentProd==null){
                deList.remove(nameProduct);
                continue;
            }
            if (temp.get(nameProduct)>currentProd.getQuantity()){
                deList.removeIf(n->n.equals(nameProduct));
            }
        }

        return deList;

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
