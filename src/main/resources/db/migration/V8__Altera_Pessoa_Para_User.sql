ALTER TABLE user
ADD email varchar(255) DEFAULT NULL,
ADD endereco varchar(255) DEFAULT NULL;

UPDATE user SET email = 'ceslobo@gmail.com', endereco = 'meu endereço' WHERE id = 1;
UPDATE user SET email = 'teste@gmail.com', endereco = 'teste endereço' WHERE id = 2;

DROP TABLE pessoa;
