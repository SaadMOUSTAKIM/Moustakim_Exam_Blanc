package ma.enset.moustakim_saad_exam_blanc.DessinPackage;

public class Decor {
    int epaisseur;
    String couleurContour;
    String couleurRemplissage;

    public Decor() {
        this.epaisseur = 1;
        this.couleurContour = "Red";
        this.couleurRemplissage = "Green";
    }

    public Decor(int epaisseur, String couleurContour, String couleurRemplissage) {
        this.epaisseur = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public int getEpaisseur() {
        return epaisseur;
    }

    public void setEpaisseur(int epaisseur) {
        this.epaisseur = epaisseur;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }
}
