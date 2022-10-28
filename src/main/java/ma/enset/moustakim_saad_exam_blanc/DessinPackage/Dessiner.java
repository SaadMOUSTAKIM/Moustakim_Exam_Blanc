package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dessiner implements Serializable {
    private DessinStrategy dessinStrategy;
    List<Dessin> dessinList = new ArrayList<>();

    public Dessiner(DessinStrategy dessinStrategy) {
        this.dessinStrategy = dessinStrategy;
    }

    public void traiter(){
        dessinStrategy.traiter();
    }
    public void ajouter(Dessin dessin){
        dessinList.add(dessin);
    }
    public void supprimer(Dessin dessin){
        dessinList.remove(dessin);
    }
    public void afficher(){
        for (Dessin dessin : dessinList) {
            dessin.afficher();
        }
    }
}
