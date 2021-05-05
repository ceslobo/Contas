ALTER TABLE users
ADD email varchar(255) DEFAULT NULL,
ADD endereco varchar(255) DEFAULT NULL;

UPDATE users SET email = 'ceslobo@gmail.com', endereco = 'meu endereço' WHERE id = 1;
UPDATE users SET email = 'teste@gmail.com', endereco = 'teste endereço' WHERE id = 2;

DROP TABLE user;