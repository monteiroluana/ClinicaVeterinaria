CREATE DATABASE dbClinicaVet;

USE dbClinicaVet;

CREATE TABLE cliente(
	idCliente     INTEGER NOT NULL AUTO_INCREMENT,
	nome          VARCHAR(255),
        cpf           VARCHAR(11),
        endereco      VARCHAR(255),
	telefone      VARCHAR(30),
        enable        BOOLEAN,	

        CONSTRAINT PK_cliente PRIMARY KEY (idCliente)
);

CREATE TABLE animal(
	idAnimal     INTEGER NOT NULL AUTO_INCREMENT,
	nome         VARCHAR(255),
        sexo         VARCHAR(255),
	especie      VARCHAR(30),
        idade        INTEGER,
        idCliente    INTEGER(11) NOT NULL,
        enable       BOOLEAN,	

        CONSTRAINT PK_animal PRIMARY KEY (idAnimal),
        FOREIGN KEY(idCliente) REFERENCES cliente(idCliente)
);

CREATE TABLE cirurgiaoGeral(
	idCirurgiao    INTEGER NOT NULL AUTO_INCREMENT,
	nome           VARCHAR(255),
        endereco       VARCHAR(255),
	telefone       VARCHAR(30),
        crm            VARCHAR(100),
        enable         BOOLEAN,	

        CONSTRAINT PK_cirurgiaoGeral PRIMARY KEY (idCirurgiao)
);


CREATE TABLE radiologista(
	idRadiologista    INTEGER NOT NULL AUTO_INCREMENT,
	nome              VARCHAR(255),
        endereco          VARCHAR(255),
	telefone          VARCHAR(30),
        conter            VARCHAR(100),
        enable            BOOLEAN,	

        CONSTRAINT PK_radiologista PRIMARY KEY (idRadiologista)
);

CREATE TABLE consulta(
	idConsulta     INTEGER NOT NULL AUTO_INCREMENT,
	dataConsulta   DATE,
        relato         VARCHAR(255),
        idAnimal       INTEGER NOT NULL,
        enable         BOOLEAN,
        nomeVet        VARCHAR(255),

	CONSTRAINT PK_consulta PRIMARY KEY (idConsulta),
        FOREIGN KEY(idAnimal) REFERENCES animal(idAnimal)        
);


INSERT INTO CLIENTE (nome, cpf, endereco, telefone, enable) VALUES
("kunieda aoi","12345678900","Av Brasil, 2546","00001111",true),
("Joao da silva","11114444777","Av Ibirapuera","524",true);

INSERT INTO ANIMAL (nome, especie, sexo, idade, idCliente, enable) VALUES
("Chico","Cachorro","macho","2","2",true),
("Pagie","Papagaio","fêmea","4","1",true);

INSERT INTO cirurgiaoGeral (nome, endereco, telefone, crm, enable) VALUES 
("bruna sayuri", "rua aaa", "55555555", "101010", true);

INSERT INTO radiologista (nome, endereco, telefone, conter, enable) VALUES 
("luana monteiro", "rua bbb", "99999999", "202020", true);

select * from consulta;