package Giocatore;

public class GiocatoreBean implements java.io.Serializable{
    private String nome;
    private String cognome;
    private String nickname;
    private int numeroVittorie;



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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getNumeroVittorie() {
        return numeroVittorie;
    }

    public void setNumeroVittorie(int  numeroVittorie) {
        this.numeroVittorie = numeroVittorie;
    }
}
