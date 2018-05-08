import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by zorm on 01.05.2018.
 */
public class Monitor {

    int orderID=0;
    int masterID=0;



    ArrayList<Garage> garages; // список гаражй

    ArrayList<Master> masters;// спсок мастров

    ArrayList<Order> orders; //список заказов

    public ArrayList<Garage> getGarages() {
        return garages;
    }

    public ArrayList<Master> getMasters() {
        return masters;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public Monitor() {
        garages=new ArrayList<>();
        masters=new ArrayList<>();
        orders=new ArrayList<>();
    }

    public  void addGarage(Garage g){
        garages.add(g);
        System.out.println("гараж добавлен");

    }

    public void addMaster(Master m){

    m.setId(masterID);
    masterID++;
        masters.add(m);

}

    public  void addOrder(Order o){
        o.setId(orderID);
        orderID++;
        o.setStatus(Status.P);
        orders.add(o);
    }

    public static void sortOrders(ArrayList orders,FlCompareOrder date){

        CompareOrder comp = new CompareOrder();
        comp.setOrderListSort(date);
        Collections.sort(orders,comp);
    }

    public  void sortMasters(boolean z){

        if (z){
            Comparator<Master> c = new Comparator<Master>() {
                @Override
                public int compare(Master o1, Master o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };

            Collections.sort(masters,c);

        }else {
            Comparator<Master> c = new Comparator<Master>() {
                @Override
                public int compare(Master o1, Master o2) {
                    return Integer.compare(o1.getOrders().size(),o2.getOrders().size());
                }
            };
            Collections.sort(masters,c);

        }

    }

    public static ArrayList sortOrderStatus(ArrayList<Order> arr,Status s){
        ArrayList<Order> ar= new ArrayList<>();


        for (Order o:arr) {
            if (o.getStatus()==s) ar.add(o);

        }

        return ar;


    }

    public static ArrayList dataAndData(ArrayList<Order> arr, Date start,Date end){

        ArrayList<Order> ar= new ArrayList<>();


        for (Order o:arr) {



                    if (o.getDateOfAdoption().after(start)&& o.getDateOfAdoption().before(end)) ar.add(o);

                    else if (o.getDateFinish().after(start)&& o.getDateFinish().before(end)) ar.add(o);

                    else if (o.getDatePlannedStart().after(start)&& o.getDatePlannedStart().before(end)) ar.add(o);





        }

        return ar;
    }




    }














