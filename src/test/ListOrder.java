package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by zorm on 04.05.2018.
 */
public class ListOrder extends ArrayList<Order> {






    public void sortDateOfAdoption(){

        Comparator<Order> o = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getDateOfAdoption().compareTo(o2.getDateOfAdoption());
            }
        };


    }
    public void sortDateFinish(){

        Comparator<Order> o = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getDateFinish().compareTo(o2.getDateFinish());
            }
        };

    }
    public void sortDatePlannedStart(){

        Comparator<Order> o = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getDatePlannedStart().compareTo(o2.getDatePlannedStart());
            }
        };

    }
    public void sortPrice(){


        Comparator<Order> o = new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return Integer.compare(o1.getPrice(), o2.getPrice());
            }
        };

    }



    public ListOrder dataAndData(Date start, Date end){

        ListOrder ar= new ListOrder();


        for (Order o:this) {

            if (o.getDateOfAdoption().after(start)&& o.getDateOfAdoption().before(end)) ar.add(o);

            else if (o.getDateFinish().after(start)&& o.getDateFinish().before(end)) ar.add(o);

            else if (o.getDatePlannedStart().after(start)&& o.getDatePlannedStart().before(end)) ar.add(o);

        }

        return ar;
    }

    public ListOrder orderStatus( Status s){
        ListOrder ar= new ListOrder();


        for (Order o:this) {
            if (o.getStatus()==s) ar.add(o);

        }

        return ar;


    }

    public ListOrder orderStatus(ListOrder arr, Status s){
        ListOrder ar= new ListOrder();


        for (Order o:arr) {
            if (o.getStatus()==s) ar.add(o);

        }

        return ar;


    }







}
