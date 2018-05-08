package test;

/**
 * Created by zorm on 01.05.2018.
 */
public class Master {
   private String name;

    private ListOrder orders;

    public Master(String name) {
        this.name = name;
        orders=new ListOrder();
    }

    public int getJob(){ // загруженость

        return orders.size();
    }

    @Override
    public String toString() {
        return "Master{" +
                "name='" + getName() + '\'' +
                ", orders=" + getOrders().toString() + ", загруз="+getJob()+
                '}';
    }

    public ListOrder getOrders() {
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
