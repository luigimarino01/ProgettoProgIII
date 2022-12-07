package Model;

public class Giocatore {
    private String nome;
    private String cognome;
    private int vittorieGiocatore;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getVittorieGiocatore() {
        return vittorieGiocatore;
    }

    public void setVittorieGiocatore(int vittorieGiocatore) {
        this.vittorieGiocatore = vittorieGiocatore;
    }
}
