CREATE TABLE `pessoa` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `mes` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ano` int NOT NULL,
  `nome` varchar(255) NOT NULL,
  `num` int NOT NULL,
  `sigla` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `gastos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `obs` varchar(255) DEFAULT NULL,
  `valor_planejado` decimal(19,2) DEFAULT NULL,
  `valor_realizado` decimal(19,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `recebidos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `valor` decimal(19,2) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `tipo_conta` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `sinal` varchar(1) NOT NULL,
  PRIMARY KEY (`id`)
);