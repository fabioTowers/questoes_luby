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

INSERT INTO tabela_pessoa (nome)
VALUES (
	'John Doe'
);

INSERT INTO tabela_pessoa (nome)
VALUES (
	'Jane Doe'
);

INSERT INTO tabela_pessoa (nome)
VALUES (
	'Alice Jones'
);

INSERT INTO tabela_pessoa (nome)
VALUES (
	'Bobby Louis'
);

INSERT INTO tabela_pessoa (nome)
VALUES (
	'Lisa Romero'
);

INSERT INTO tabela_evento (evento, pessoa_id)
VALUES (
	'Evento A',
    2
);

INSERT INTO tabela_evento (evento, pessoa_id)
VALUES (
	'Evento B',
    3
);

INSERT INTO tabela_evento (evento, pessoa_id)
VALUES (
	'Evento C',
    2
);

INSERT INTO tabela_evento (evento, pessoa_id)
VALUES (
	'Evento D',
    null
);


