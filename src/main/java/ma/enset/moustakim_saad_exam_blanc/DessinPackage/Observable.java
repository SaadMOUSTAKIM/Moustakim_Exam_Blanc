package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

public interface Observable {
    public void addObserver(DessinObserver obs);
    public void removeObserver(DessinObserver obs);
    public void  notifyObservers();
}
