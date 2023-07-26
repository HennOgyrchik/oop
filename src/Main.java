import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Food product1 = new Food("Twix", 80,1, new GregorianCalendar(2023,10,10),0.3);
        Food product2= new Food("Mars", 90, 50, new GregorianCalendar(2023,10,10),0.2);
        Food product3=new Food("Sneakers",60,15,new GregorianCalendar(2023,10,10),0.15);

        Automat vending = new Automat();

        ArrayList<Food> productList=new  ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        vending.initProduct(productList);

        ArrayList<String> desiredProducts = new ArrayList<>();
        desiredProducts.add("Twix");
        desiredProducts.add("MilkyWay");
        desiredProducts.add("Mars");
        desiredProducts.add("Mars");
        desiredProducts.add("Twix");

        HotBeverageAutomat hotAutomat = new HotBeverageAutomat();
        ArrayList<HotBeverage> hotList=new ArrayList<>();
        HotBeverage hot1=new HotBeverage("Coffee",5,10,new GregorianCalendar(2023,10,10),0.6,60);
        HotBeverage hot2=new HotBeverage("Tea",5,10,new GregorianCalendar(2023,10,10),0.3,70);
        HotBeverage hot3=new HotBeverage("Compot",5,10,new GregorianCalendar(2023,10,10),0.5,20);

        hotList.add(hot1);
        hotList.add(hot2);
        hotList.add(hot3);

        hotAutomat.initProduct(hotList);

        Human vasya = new Human("Вася",100);
        vasya.setNearestAutomat(vending);

        vasya.validateOrder(desiredProducts);
        Order vasyaOrder = vasya.makeOrder(desiredProducts);
        //System.out.println(vasyaOrder);

        hotList.sort(new BeverageComparator());
        System.out.println(hotList);

        productList.sort(new FoodComparator());
        System.out.println(productList);

        hotList.sort(new HotBeverageComparator());
        System.out.println(hotList);

    }
}