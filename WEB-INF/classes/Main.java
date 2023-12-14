package mainty;

import java.util.ArrayList;

import fonc.Fonction;
import primaryM.Matiere;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        try {
            Fonction fonction = new Fonction();
            // int o = fonction.insertLook("fer", "luxe");
                // System.out.println(o);
            ArrayList list = new ArrayList<>();
            list = fonction.geListMP("luxe");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(( (Matiere)list.get(i)).getnom());
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}