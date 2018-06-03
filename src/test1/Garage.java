package test1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zorm on 01.05.2018.
 */
public class Garage {

    private List<WorkPlace> workPlaces;



    public Garage() {
        workPlaces = new ArrayList<>();
    }

    public Garage(int workPlace) {
        workPlaces = new ArrayList<>();

        for (int i = 0; i<workPlace; i++){
               this.addWorkPlace();
           }
    }




    public List<WorkPlace> getWorkPlaces() {
        return workPlaces;
    }







    public void addWorkPlace() {

        this.workPlaces.add(new WorkPlace());
    }


    public void removWorkPlace() {
        for (int i = 0; i<workPlaces.size(); i++) {

            if (workPlaces.get(i).isBusy()) {
                this.workPlaces.remove(i);
            }
            else System.out.println("какя то хуйня. Скорее всего все места заняты");
        }
    }




public int freePlaces(){
     int freePlaces=0;
    for (WorkPlace w:this.workPlaces) {
        if (w.isBusy()) freePlaces++;
    }
    return freePlaces;

}



    public void aPlace(){
        for (WorkPlace w:workPlaces) {
            if (w.isBusy()==false) w.setBusy(true);
            break;
        }

    }



    public void bPlace(){

        for (WorkPlace w:workPlaces) {
            if (w.isBusy()==true) w.setBusy(false);
            break;
        }
    }




}
