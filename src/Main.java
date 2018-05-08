import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by zorm on 02.05.2018.
 */
public class Main {
    static Monitor monitor = new Monitor();
    public static void main(String[] args) {



       /* Garage garage = new Garage();
        monitor.addGarage(garage);*/
        int i = 01;
        System.out.println(i);









    }




    public int freePlacesGarages(){
        int fpg=0;
        for (Garage g: monitor.getGarages()){
            fpg+=g.freePlaces();

        }
        System.out.println("Свобоных мст во всех гаражах "+ fpg);
        return fpg;

    }//ссок свобоных мст в

    public ArrayList allListOrder(FlCompareOrder fco){
    ArrayList arr = monitor.getOrders();

    Monitor.sortOrders(arr,fco);

    return arr;

} // список всех заказов по FicompareOrder


    public ArrayList allListMaster(boolean dZ){
        monitor.sortMasters(dZ);
       return monitor.getMasters();

    }// список авто мастеров по алфавиту по занятости


    public ArrayList listOrderStatus(Status s,FlCompareOrder fco){
        ArrayList arr;
        if (s!=null) arr = Monitor.sortOrderStatus(monitor.getOrders(),s);
        else arr=monitor.getOrders();

        Monitor.sortOrders(arr,fco);
        return arr;
    }// список выполнямых заказов по FicompareOrder


    public ArrayList listOrderStatusDateAndDate(Status s, Date start , Date end,FlCompareOrder fl){
        ArrayList<Order> arr;

        if (s==null) arr=Monitor.dataAndData(monitor.getOrders(),start,end);

           arr= Monitor.sortOrderStatus(Monitor.dataAndData(monitor.getOrders(),start,end),s);
        Monitor.sortOrders(arr,fl);

        return arr;

    }//сисок заказов по статусу за промежуток времени

    // управлееие списком заказов))
    public void managengListOrder()  {


       Myclass m = new Myclass(){};








    }

    // вывод сиска
    public void prnt(ArrayList arr){

        for (Object o:arr) {
            System.out.println("index" + arr.indexOf(o)+" "+ o.toString());
        }

    }


    private class Myclass {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public void step0() throws IOException {
            System.out.println("Все заказы: 1 / за промежуток времени: 2");
            int i = Integer.parseInt(reader.readLine());
           switch (i){
               case 1: step2(monitor.getOrders());
                   break;
               case 2: step2(step4(monitor.getOrders()));
           }



        }
        public void step2(ArrayList arr) throws IOException {

            System.out.println("Статус: 0 пофиг/ 1 принят/ 2 выполняется/ 3 закончен/ 4 удален/ 5 назад");

            int i =Integer.parseInt(reader.readLine());


                switch (i){
                    case 0: step3(arr,arr);
                        break;
                    case 1: step3(Monitor.sortOrderStatus(arr,Status.P),arr);
                        break;
                    case 2:  step3(Monitor.sortOrderStatus(arr,Status.V),arr);
                        break;
                    case 3:  step3(Monitor.sortOrderStatus(arr,Status.F),arr);
                        break;
                    case 4:  step3(Monitor.sortOrderStatus(arr,Status.D),arr);
                        break;
                    case 5: step0();
                }


        }
        public void step3(ArrayList arr, ArrayList ar) throws IOException {


            System.out.println("сортировать по: 1 дате принятия/ 2 дата закрытия/ 3 дате предполог начало/ 4 цене/ 5 назад");

            int i = Integer.parseInt(reader.readLine());

            switch (i){
                case 1:
                    Monitor.sortOrders(arr,FlCompareOrder.DateOfAdoption);
                    break;
                    case 2:
                        Monitor.sortOrders(arr,FlCompareOrder.DateFinish);
                    break;
                    case 3:
                        Monitor.sortOrders(arr,FlCompareOrder.DatePlannedStart);
                    break;
                    case 4:
                        Monitor.sortOrders(arr,FlCompareOrder.Price);
                    break;
                    case 5:
                    step2(ar);
                    break ;

            }








        }
        public ArrayList step4(ArrayList arr) throws IOException {

            System.out.println("Ввеите дату начала yyyy mm dd");

            Date s = stepdate(reader.readLine());
            System.out.println("Ввеите дату конца yyyy mm dd");
            Date e = stepdate(reader.readLine());

            return Monitor.dataAndData(arr,s,e);






        }
        public Date stepdate(String s){
            String[] arr = s.split(" ");

            return new Date (Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));



        }

        // конец метоов для заказов





        public void mainStep() throws IOException {

            int i = Integer.parseInt(reader.readLine());

            switch (i){

                case 1: break;//  гаражи
                case 2: break; //добавить место в гараж номер
                case 3: break;// добавить работника
                case 4: break;// добавить заказ
                case 5: step0(); break;// посмотреть заказы
                case 6: break;// посмотреть мастеров
                case 7: break;// посмотреть количество свобоных мест в гараже
                case 8: break;// посмотреть ближфйшую свободную дату
                case 9: break;// посмотреть количество своб менс на ату в будущ

            }


        }
        public void step7() throws IOException {

            int i = Integer.parseInt(reader.readLine());

            ArrayList ar = monitor.getGarages();



            switch (i){
                case 1: break;
                case 2: break;
            }




        }


    }
}
