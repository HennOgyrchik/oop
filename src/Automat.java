import java.util.ArrayList;
import java.util.List;

public class Automat {
    List<Product> productList=new ArrayList<>();

    public void initProduct(List<Product> productList){
        this.productList=productList;
    }

    public Product getProduct(String name) {
        for (Product prod :
                productList) {
            if (prod.getName().equals(name)) return  prod;

        }
        return null;
    }

    public Order createOrder(ArrayList<Product> shoppingList, Human man){
/*
нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"
Создать объек Order с полями List<Product>, который содержит только продукты из наличия, и поле стоимость - сумма цен продуктов, входящих в заказ.
Вернуть объект Order.
 */
        int sum=0;
        for (Product prod : shoppingList) {
            if(getProduct(prod.getName()).getQuantity()>0){
                sum+=getProduct(prod.getName()).getPrice();
            } else {
                shoppingList.remove(prod);
            }
        }

        Order order = new Order();
        order.setCost(sum);
        order.setProducts(shoppingList);
        order.setMan(man);

        return order;
    }
}
