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
}
