import java.util.ArrayList;

public interface ActorBehavoir {

    void setMakeOrder(boolean flag);
    void setTakeOrder(boolean flag);
    boolean isMakeOrder();
    boolean isTakeOrder();

    Order makeOrder(ArrayList<String> deList);
}
