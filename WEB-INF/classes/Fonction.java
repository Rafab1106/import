package fonc;

import java.sql.*;
import java.util.ArrayList;

import primaryM.Matiere;
import connex.Connectbase;

/**
 * Fonction
 */
public class Fonction {

    static Connectbase base = new Connectbase();
    static Statement statement = base.getconnexpost();

    public boolean check(String nomMP)throws Exception{
        boolean isIn = false;
        String requete = String.format("SELECT libelle from matiereP WHERE libelle = '%s'",nomMP);
        
        ResultSet result = statement.executeQuery(requete);
        if (result.next()) {
            isIn = true;            
        }
        
        return isIn;
    }
    public int insertMP(String nomMP)throws Exception{
        int result = -1;
        try {
            String requete = String.format("INSERT INTO matiereP(libelle) VALUES ('%s')", nomMP);
            System.out.println(requete);
            result = statement.executeUpdate(requete);   
        } catch (Exception e) {
            //TODO: handle exception
            throw e;
        }   
        
        return result;
    } 
    public int insertLook(String nomMP,String look)throws Exception{
        int result = -1;
        boolean isIn = this.check(nomMP);
        if (!isIn) {
            int dd = this.insertMP(nomMP);
        }
        try {
            String requete = String.format("INSERT INTO look(mp,libelle) VALUES ('%s','%s')",nomMP,look);
            result = statement.executeUpdate(requete);   
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        return result;
    }
    public ArrayList getMP(String look)throws Exception{
        ArrayList listidMP = new ArrayList<>();
        String requete = String.format("SELECT Mp from look WHERE libelle = '%s'",look);
        ResultSet result = statement.executeQuery(requete);
        while (result.next()) {
            // idM = result.getInt("idM");
            String mtp = result.getString(1);
            Matiere mp = new Matiere(mtp);
            listidMP.add(mp);
        }
        
        return listidMP;
    }

    public ArrayList<Integer> getMlP(String idMp)throws Exception{
        int idM = 0;
        ArrayList<Integer> listidMP = new ArrayList<>();
        String requete = String.format("SELECT idM from matiere WHERE libelle = '%s'",idMp);
        ResultSet result = statement.executeQuery(requete);
        if (result.next()){
            idM = result.getInt("idM");
            listidMP.add(idM);
        }
        
        return listidMP;
    }

    public ArrayList geListMP(String nomLook)throws Exception{
        ArrayList listMP = new ArrayList();
        Matiere mp = new Matiere();
        try {
            String requete = String.format("SELECT * FROM look WHERE  libelle ILIKE'%s'",nomLook);
            System.out.println(requete);
            ResultSet result = statement.executeQuery(requete);
            while (result.next()) {
                // int id = result.getInt("id");
                String libelle = result.getString("mp");
                mp = new Matiere(libelle);
                listMP.add(mp);
            }   
        } catch (Exception e) {
            //TODO: handle exception
            throw e;
        }
        return listMP;
    } 
}