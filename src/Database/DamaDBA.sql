CREATE TABLE Giocatore(
    nome varchar(30) NOT NULL,
    cognome varchar(30) NOT NULL,
    nickname varchar(20) NOT NULL,
    numeroVittorie int NOT NULL,
    PRIMARY KEY(nickname)

)

CREATE TABLE Pedina(
    idPedina int NOT NULL AUTO_INCREMENT,
    x int NOT NULL,
    y int NOT NULL,
    PRIMARY KEY(idPedina)
)

CREATE TABLE Partita(
    idPartita int NOT NULL AUTO_INCREMENT,
    vittoria int NOT NULL,
    nickname varchar(20) NOT NULL,
    PRIMARY KEY(idPartita),
    FOREIGN KEY(nickname) REFERENCES Giocatore(nickname)
)

CREATE TABLE Contiene(
    idPartita int NOT NULL,
    idPedina int NOT NULL,
    PRIMARY KEY(idPartita, idPedina),
    FOREIGN KEY(idPartita) REFERENCES Partita(idPartita),
    FOREIGN KEY(idPedina) REFERENCES Pedina(idPedina)
)

CREATE TABLE Sposta(
    xSposta int NOT NULL,
    ySposta int NOT NULL,
    nickname varchar(20) NOT NULL,
    idPedina int NOT NULL,
    idPartita int NOT NULL,
    PRIMARY KEY(nickname, idPedina, idPartita),
    FOREIGN KEY(nickname) REFERENCES Giocatore(nickname),
    FOREIGN KEY(idPartita) REFERENCES Partita(idPartita),
    FOREIGN KEY(idPedina) REFERENCES Pedina(idPedina)
)