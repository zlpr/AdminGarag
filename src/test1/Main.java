package test1;

import test1.ui.Menu;
import test1.ui.MenuEntry;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by zorm on 07.05.2018.
 */
public class Main implements Serializable {

    public static void main(String[] args) throws ParseException {
/*
        ListOrder lo = new ListOrder();

        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("10.6.2018"),12));
        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("4.8.2018"),165));
        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("7.6.2018"),120));
        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("4.6.2018"),32));
        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("6.6.2018"),22));


        lo.sortPrice();*/
        Menu menu = new Menu();
        menu.addEntry(new MenuEntry("fdfg") {
            @Override
            public void run() throws Exception {
                System.out.println("fdfgdfgdfg");
                Menu menu = new Menu();
                menu.addEntry(new MenuEntry("ffgfffg") {
                    @Override
                    public void run() throws ParseException {
                        System.out.println("списяк сорт");

                        ListOrder lo = new ListOrder();

                        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("10.6.2018"),12));
                        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("4.8.2018"),165));
                        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("7.6.2018"),120));
                        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("4.6.2018"),32));
                        lo.add(new Order(new Date(),new SimpleDateFormat("dd.MM.yyyy").parse("6.6.2018"),22));


                        lo.sortPrice();
                        System.out.println(lo.toString());
                    }
                });
                menu.addEntry(new MenuEntry("ываыва") {
                    @Override
                    public void run() {
                        System.out.println("ываываы");
                    }
                });
                menu.run();
            }
        });

        menu.addEntry(new MenuEntry("ываыва") {
            @Override
            public void run() {
                System.out.println("tываываы");
            }
        });
        menu.run();



    }

    public static Date addDays(Date date, int days)
    {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, days);
        return c.getTime();
    }









}
