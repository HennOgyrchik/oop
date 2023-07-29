import java.util.ArrayList;

public class Order<T extends Product> {
    private ArrayList<Product> products;
    private Human man;

    private int cost;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Human getMan() {
        return man;
    }

    public void setMan(Human man) {
        this.man = man;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
     /*
     В классе Order переопределить метод toString() - показывать состав заказа, заказчика и общую стоимость продуктов.
     */
        return "Human:"+man+"\nProduct list:\n"+products+"\nCost:"+cost;
    }
}
