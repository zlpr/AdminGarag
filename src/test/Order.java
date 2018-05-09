package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zorm on 01.05.2018.
 */
public class Order {
    private int price;
   private Date dateOfAdoption;
   private Date dateFinish;
   private Date datePlannedStart;
   private Status status;
   private ListMaster masters;

    public Order( Date dateOfAdoption, Date datePlannedStart, int price) {

        this.dateOfAdoption = dateOfAdoption;
        this.datePlannedStart = datePlannedStart;
        this.price = price;
        this.status = Status.P;
        this.masters = new ListMaster();
       // this.dateFinish = null;

    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {


        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ListMaster getMasters() {
        return masters;
    }

    public void addMasters(Master master) {
        if (masters.contains(master)){
            return;
        }else  this.masters.add(master);
    }
    public void removMasters(Master master) {
        this.masters.remove(master);
    }


    public Date getDatePlannedStart() {
        return datePlannedStart;
    }

    public void setDatePlannedStart(Date datePlannedStart) {

        this.datePlannedStart = datePlannedStart;
    }

    public Date getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Date dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public Date getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Date dateFinish) {
        this.dateFinish = dateFinish;
    }


    @Override
    public String toString() {

        SimpleDateFormat date = new SimpleDateFormat("dd.mm.yyyy");



        return /*String.format("%d|%s|%s|%s|%s|%s",
                price,
                date.format(dateOfAdoption),
                date.format(datePlannedStart),
                date.format(dateFinish),
                status,
                masters.toString());*/ "\nOrder{\n" +
                "dateFinish=" + dateFinish +
                ",\n price=" + price +
                ",\n dateOfAdoption=" + dateOfAdoption +
                ", \ndatePlannedStart=" + datePlannedStart +
                ",\n status=" + status +
                ",\n masters=" + masters.toString() +
                "}\n";
    }
}
