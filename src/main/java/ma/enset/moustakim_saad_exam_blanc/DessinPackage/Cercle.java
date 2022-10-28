package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

public class Cercle implements Dessin, DessinObserver {
    Observable observable = new ObservableImpl();
    Decor decor = new Decor();

    public Cercle(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void afficher() {

    }
    public double calculerPerimetre(double r){
        return 2*Math.PI*r;
    }
    public double calculerSurface(double r){
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public void update() {

    }
}
