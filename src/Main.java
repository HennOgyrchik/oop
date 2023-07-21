import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Food("Twix", 80,10, new GregorianCalendar(2023,10,10),0.1);
        Product product2= new Food("Mars", 90, 50, new GregorianCalendar(2023,10,10),0.2);
        Product product3=new Food("Sneakers",60,15,new GregorianCalendar(2023,10,10),0.15);

        Automat vending = new Automat();

        ArrayList<Product> productList=new  ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        vending.initProduct(productList);

        String productName="Mars";
        System.out.println(vending.getProduct(productName).toString());

        System.out.println();

        HotBeverageAutomat hotAutomat = new HotBeverageAutomat();
        ArrayList<HotBeverage> hotList=new ArrayList<>();
        HotBeverage hot1=new HotBeverage("Coffee",5,10,new GregorianCalendar(2023,10,10),0.25,60);
        HotBeverage hot2=new HotBeverage("Tea",5,10,new GregorianCalendar(2023,10,10),0.25,60);
        HotBeverage hot3=new HotBeverage("Compot",5,10,new GregorianCalendar(2023,10,10),0.25,60);


        hotList.add(hot1);
        hotList.add(hot2);
        hotList.add(hot3);

        hotAutomat.initProduct(hotList);
        System.out.println(hotAutomat.getProduct("Tea",0.25,60).toString());


    }
}