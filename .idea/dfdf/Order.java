package dfdf;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by zorm on 30.04.2018.
 */
public class Order {
    private Calendar dateOfAdoption; // принятия
   private Calendar dateFinish; //закрытия
   private Calendar datePlannedStart;//возможного начала
   private float price;//цена
    private Status status;
  /* private boolean v; //выполнен
   private boolean u;//удален
   private boolean o;//отменен*/

    // вот в этом месте мне показалось, что лучше сделать enumы
    private ArrayList<Master> executingOrder;

    public ArrayList<Master> getExecutingOrder() {
        return executingOrder;
    }

    public void setExecutingOrder(ArrayList<Master> executingOrder) {
        this.executingOrder = executingOrder;
    }




    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }



    public Calendar getDatePlannedStart() {
        return datePlannedStart;
    }

    public void setDatePlannedStart(Calendar datePlannedStart) {
        this.datePlannedStart = datePlannedStart;
    }

    public Calendar getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Calendar dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    public Calendar getDateFinish() {
        return dateFinish;
    }

    public void setDateFinish(Calendar dateFinish) {
        this.dateFinish = dateFinish;
    }


}
