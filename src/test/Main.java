package test;

import java.util.Date;

/**
 * Created by zorm on 07.05.2018.
 */
public class Main {


    public static void main(String[] args) {

        ListMaster listMaster = new ListMaster();

        listMaster.add(new Master("jdkfj"));
        listMaster.add(new Master("jdkd"));
        listMaster.add(new Master("adkf1"));

        listMaster.get(1).getOrders().add(new Order(new Date(),new Date(),21255));

        ListOrder listOrder = new ListOrder();

        Order f = new Order(new Date(),new Date(118,04,23),1245);
        f.addMasters(listMaster.get(2));


        Garage garage = new Garage(5);



        f.addMasters(listMaster.get(0));
        f.addMasters(listMaster.get(2));
        f.addMasters(listMaster.get(1));
        f.removMasters(f.getMasters().get(0));

        System.out.println(f.toString());



        listMaster.sortAbc();

        listMaster.print();

        System.out.println(new Master("dfkjdkkkk").toString());
    }



}
