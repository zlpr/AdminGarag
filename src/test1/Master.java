package test1;

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
        int i =0;

        for (Order o: orders){
            if (o.getStatus()== Status.V) i++;

        }

        return i;
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
        if (orders.contains(order)) return;
        this.orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
