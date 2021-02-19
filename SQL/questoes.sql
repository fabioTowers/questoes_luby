CREATE DATABASE luby;

USE luby;

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
    pessoa_id int unsigned,
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

SELECT * FROM tabela_pessoa;

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

SELECT * FROM tabela_evento;

/*2.1***********************************/
SELECT tabela_pessoa.nome, tabela_evento.evento
FROM tabela_pessoa
INNER JOIN tabela_evento
ON tabela_pessoa.id = pessoa_id;

/*2.2***********************************/
SELECT nome FROM tabela_pessoa WHERE LOCATE('Doe', nome);
