import java.util.Comparator;

/**
 * Created by zorm on 30.04.2018.
 */
public class CompareOrder implements Comparator<Order> {



    private FlCompareOrder orderListSort;

    public void setOrderListSort(FlCompareOrder orderListSort) {
        this.orderListSort = orderListSort;
    }



    @Override
    public int compare(Order o1, Order o2) {


        switch (orderListSort) {
            case DateOfAdoption:
                int dofa = o1.getDateOfAdoption().compareTo(o2.getDateOfAdoption());
                if (dofa != 0)
                    return dofa;
                break;
            case DateFinish:
                int df = o1.getDateFinish().compareTo(o2.getDateFinish());
                if (df != 0)
                    return df;
                break;
            case DatePlannedStart:
                int dps =
                        o1.getDatePlannedStart().compareTo(o2.getDatePlannedStart());
                if (dps != 0)
                    return dps;
                break;
            case Price:
                int price = Float.compare(o1.getPrice(), o2.getPrice());
                if (price != 0)
                    return price;
                break;
        }

      return 0;
    }


}


