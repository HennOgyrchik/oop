import java.util.ArrayList;
import java.util.List;

public class Automat implements AddInAutomat<Product>{
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

    public Order<Product> createOrder(ArrayList<Product> shoppingList, Human man){
/*
нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"
Создать объек Order с полями List<Product>, который содержит только продукты из наличия, и поле стоимость - сумма цен продуктов, входящих в заказ.
Вернуть объект Order.
 */
        int sum=0;
        for (Product prod : shoppingList) {
            sum+=getProduct(prod.getName()).getPrice();
        }

        Order<Product> order = new Order<Product>();
        order.setCost(sum);
        order.setProducts(shoppingList);
        order.setMan(man);

        return order;
    }

    @Override
    public void addInAutomat(Product product) {
        productList.add(product);
    }
}
