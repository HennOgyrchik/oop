import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Food("Twix", 80,10, new GregorianCalendar(2023,10,10));
        Product product2= new Food("Mars", 90, 50, new GregorianCalendar(2023,10,10));
        Product product3=new Food("Sneakers",60,15,new GregorianCalendar(2023,10,10));



        ArrayList<Product> productList=new  ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        Automat vending = new Automat();
        vending.initProduct(productList);

        String productName="Mars";
        System.out.println(vending.getProduct(productName).toString());

        Human vasya = new Human("Вася",100);
        vasya.setNearestAutomat(vending);

        System.out.println(vasya);
    }
}