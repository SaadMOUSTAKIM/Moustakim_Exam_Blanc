package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

public class Rectangle implements Dessin, DessinObserver {
    Observable observable = new ObservableImpl();
    Decor decor = new Decor();

    public Rectangle(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void afficher() {

    }
    public double calculerPerimetre(double l,double h){
        return (l+h)*2;
    }
    public double calculerSurface(double l,double h){
        return l*h;
    }

    @Override
    public void update() {

    }
}
