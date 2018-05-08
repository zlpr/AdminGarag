import java.util.ArrayList;

/**
 * Created by zorm on 01.05.2018.
 */
public class Master {
    private int id;
   private String name;

    private ArrayList<Order> orders;

    public Master(String name) {
        this.name = name;
        orders=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + getName() + '\'' +
                ", orders=" + getJob() +
                '}';
    }

    public int getJob(){ // загруженость

        return orders.size();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {// добавить работы
        this.orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
