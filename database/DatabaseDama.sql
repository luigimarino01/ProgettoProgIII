CREATE DATABASE DAMA;

CREATE TABLE GIOCATORE
(
    Nome varchar(20) NOT NULL,
    Nickname varchar(20) NOT NULL,
    PRIMARY KEY(Nome,Nickname)
);

CREATE TABLE Partita
(
    IdPartita   int NOT NULL,
    Vittorie    int NOT NULL,
    Nome varchar(20) NOT NULL,
    Nickname varchar(20) NOT NULL,
    FOREIGN KEY(Nome) REFERENCES GIOCATORE(Nome),
    FOREIGN KEY(Nickname) REFERENCES GIOCATORE(Nickname),
    PRIMARY KEY(IdPartita)
);

CREATE TABLE Pedina
(
    X_iniziale  int NOT NULL,
    Y_iniziale  int NOT NULL,
    IdPedina    int NOT NULL,
    IdPartita   int NOT NULL,
    FOREIGN KEY(IdPartita) REFERENCES Partita(IdPartita),
    PRIMARY KEY(IdPedina)
);

CREATE TABLE Mossa
(
    X_finale    int NOT NULL,
    Y_finale    int NOT NULL,
    ContatoreMosse  int NOT NULL;
    IdPedina    int NOT NULL,
    IdPartita   int NOT NULL,
    Nome varchar(20) NOT NULL,
    Nickname varchar(20) NOT NULL,
    FOREIGN KEY(Nome,Nickname) REFERENCES GIOCATORE(Nome,Nickname),
    FOREIGN KEY(IdPartita) REFERENCES Partita(IdPartita), 
    FOREIGN KEY(IdPedina) REFERENCES Pedina(IdPedina),
    PRIMARY KEY(X_finale,Y_finale,IdPedina)
);