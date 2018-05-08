import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zorm on 01.05.2018.
 */
public class Order  {
    private int id;
    private int price;
   private Date dateOfAdoption;
   private Date dateFinish;
   private Date datePlannedStart;
   private Status status;
   private ArrayList<Master> masters = new ArrayList<>();

    public Order(int id, Date dateOfAdoption, Date datePlannedStart, int price) {

        this.id = id;
        this.dateOfAdoption = dateOfAdoption;
        this.datePlannedStart = datePlannedStart;
        this.price = price;

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

    public ArrayList<Master> getMasters() {
        return masters;
    }

    public void addMasters(Master master) {
        this.masters.add(master);
    }
    public void removMasters(Master master) {
        this.masters.remove(master);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
