package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<DessinObserver> dessinObserverList = new ArrayList<>();
    Decor decor = new Decor();
    @Override
    public void addObserver(DessinObserver obs) {
        dessinObserverList.add(obs);
    }

    @Override
    public void removeObserver(DessinObserver obs) {
        dessinObserverList.remove(obs);
    }
    public void setColoers(Decor decor) {
        this.decor.setCouleurContour(decor.getCouleurContour());
        this.decor.setEpaisseur(decor.getEpaisseur());
        this.decor.setCouleurRemplissage(decor.getCouleurRemplissage());
        notifyObservers();
    }

    @Override
    public void notifyObservers(){
        for (DessinObserver dessinObserver : dessinObserverList) {
            dessinObserver.update();
        }
    }

}
