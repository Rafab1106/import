package connex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connectbase{
    public Connectbase() {}
    public Statement getconnexpost() {
        Connection con = null;
        Statement statement = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/poketra";
            String user = "postgres";
            String mdp = "0714";
            con = DriverManager.getConnection(url, user, mdp);
            statement = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statement;
    }
}