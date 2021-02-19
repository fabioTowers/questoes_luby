CREATE DATABASE luby;

CREATE TABLE tabela_pessoa
(
	id int unsigned not null auto_increment,
    nome varchar(50) not null,
    PRIMARY KEY (id)
);

CREATE TABLE tabela_evento
(
	id int unsigned not null auto_increment,
    evento varchar(50) not null,
    PRIMARY KEY (id),
    CONSTRAINT fk_evento_pessoa FOREIGN KEY (pessoa_id) REFERENCES tabela_pessoa (id)
);
