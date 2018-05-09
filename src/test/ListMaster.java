package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by zorm on 06.05.2018.
 */
public class ListMaster extends ArrayList<Master> {


    public  ListMaster sortAbc(){


            Comparator<Master> c = new Comparator<Master>() {
                @Override
                public int compare(Master o1, Master o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            };

            Collections.sort(this,c);
        return this;
    }
    public  ListMaster sortJob(){


            Comparator<Master> c = new Comparator<Master>() {
                @Override
                public int compare(Master o1, Master o2) {
                    return Integer.compare(o1.getOrders().size(),o2.getOrders().size());
                }
            };
            Collections.sort(this,c);

        return this;

    }


    public void print() {
        for (int i =0; i<this.size();i++){

            System.out.println( i+") "+this.get(i).toString());
        }

    }

    @Override
    public String toString() {

        String s="\nListMaster{\n";

        for (Master m: this){
            s+= this.indexOf(m)+")"+m.toString()+"\n"; //this.indexOf(m)+")"+ "name="+m.getName()+" загр="+m.getJob()+",\n";
        }
        return s+" }\n";
    }


}
