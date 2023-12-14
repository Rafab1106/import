package primaryM;

/**
 * Matiere
 */
public class Matiere {

    int id;
    String nom;

    public Matiere(){}
    public Matiere(String nom) {
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getnom() {
        return nom;
    }
    public void setnom(String nom) {
        this.nom = nom;
    }
}