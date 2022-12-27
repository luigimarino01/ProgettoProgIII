package Database;

import Partita.Partita;
import Giocatore.Giocatore;
import Pedine.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DamaDB {

    private static DamaDB istanza;
    private final String url = "jdbc:mysql://localhost:3306/damadatabase";
    Connection con;
    private DamaDB(){}

    public static DamaDB getIstanza(){
        if (istanza == null){
            istanza = new DamaDB();
        }
        return istanza;
    }

    public void aggiungiGiocatoreDB(Giocatore giocatore){
        try {
            con = DriverManager.getConnection(url,"ROOT","ROOT");

            PreparedStatement stmt = con.prepareStatement("INSERT INTO Giocatore values (?, ?, ?, ?)");

            stmt.setString(1,giocatore.getGiocatore().getNome());
            stmt.setString(2,giocatore.getGiocatore().getCognome());
            stmt.setString(3,giocatore.getGiocatore().getNickname());
            stmt.setInt(4,0);
            stmt.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    public void aggiungiVittoriaDB(Giocatore giocatore){

        try {
            con = DriverManager.getConnection(url,"ROOT","ROOT");
            PreparedStatement stmt = con.prepareStatement("UPDATE Giocatore SET NumeroVittorie=(?) WHERE nickname = (?)");
            stmt.setInt(1,giocatore.getGiocatore().getNumeroVittorie());
            stmt.setString(2,giocatore.getGiocatore().getNickname());
            stmt.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public void aggiungiPedinaDB(PedinaClient pedina){
        try {
            con = DriverManager.getConnection(url,"ROOT","ROOT");
            PreparedStatement stmt = con.prepareStatement("INSERT INTO Pedina (x,y) VALUES (?,?)");
            stmt.setInt(1,pedina.getxCorrente());
            stmt.setInt(2,pedina.getyCorrente());
            stmt.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

public void inizializzaPrimePedineDB(ArrayList<PedinaClient> pedine){
    try {
        con = DriverManager.getConnection(url,"ROOT","ROOT");
        for (int i = 1; i<13; i++){
            PreparedStatement stmt = con.prepareStatement("UPDATE Pedina SET x = (?), y = (?) WHERE idPedina = (?)");
            stmt.setInt(1,pedine.get(i-1).getxCorrente());
            stmt.setInt(2,pedine.get(i-1).getyCorrente());
            stmt.setInt(3,i);
            stmt.execute();
        }

    }
    catch (SQLException e){
        e.printStackTrace();
    }
    finally {
        try{
            if (con!=null)
                con.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}

    public void inizializzaSecondePedineDB(ArrayList<PedinaClient> pedine){
        try {
            con = DriverManager.getConnection(url,"ROOT","ROOT");
            for (int i = 13; i<25; i++){
                PreparedStatement stmt = con.prepareStatement("UPDATE Pedina SET x = (?), y = (?) WHERE idPedina = (?)");
                stmt.setInt(1,pedine.get(i-13).getxCorrente());
                stmt.setInt(2,pedine.get(i-13).getyCorrente());
                stmt.setInt(3,i);
                stmt.execute();
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

public void inizializzaPedinaNeraDB(int i, PedinaClient pedina){


}
    public void spostamentoPedinaDB(PedinaClient pedina, int x, int y){
        try {
            con = DriverManager.getConnection(url,"ROOT","ROOT");
            PreparedStatement stmt = con.prepareStatement("UPDATE Pedina SET x = (?), y = (?) WHERE x = (?) AND  y = (?)");
            stmt.setInt(1,x);
            stmt.setInt(2,y);

            stmt.setInt(3,pedina.getxCorrente());
            stmt.setInt(4,pedina.getyCorrente());

            stmt.execute();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    public void aggiungiPartitaDB(Partita partita){
        try {
            con = DriverManager.getConnection(url);
           /* PreparedStatement stmt = con.prepareStatement("UPDATE Giocatore SET NumeroVittorie=(?) WHERE bank_number = (?)");
            stmt.setFloat(1,amount);
            stmt.setString(2,bankNumber);
            stmt.execute();*/
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            try{
                if (con!=null)
                    con.close();
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}






