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

        //listMaster.get(1).getOrders().add(new Order(new Date(),new Date(),21255));

        Order f = new Order(new Date(),new Date(),1245);


        f.addMasters(listMaster.get(0));
        f.addMasters(listMaster.get(2));
        f.addMasters(listMaster.get(1));

        System.out.println(f.toString());



        listMaster.sortAbc();

        listMaster.print();

        System.out.println(new Master("dfkjdkkkk").toString());
    }



}
