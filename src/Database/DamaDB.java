package Database;

import Partita.Partita;
import Giocatore.Giocatore;
import Pedine.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DamaDB {
    private final String url = "";
    Connection con;

    public void aggiungiGiocatore(Giocatore giocatore){
        try {
            con = DriverManager.getConnection(url);
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
    public void aggiungiVittoria(Giocatore giocatore){

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

    public void spostamentoPedina(PedinaClient pedina){
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
    public void aggiungiPartita(Partita partita){
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






