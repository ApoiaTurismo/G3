CREATE TABLE `Produto` (
	`id` bigint(255) NOT NULL AUTO_INCREMENT,
	`Titulo` varchar(255) NOT NULL,
	`Foto` blob NOT NULL,
	`Descrição` varchar(255) NOT NULL,
	`Preço` DECIMAL NOT NULL,
	`id_categoria` bigint NOT NULL,
	`id_usuario` bigint NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Categoria` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`Tipo` varchar(255) NOT NULL,
	`Descrição` varchar(255) NOT NULL,
	`Região` enum('Norte', 'Nordeste', "Centro-Oeste', 'Sudeste', 'Sul') NOT NULL,
	PRIMARY KEY (`id`)
);

CREATE TABLE `Usuário` (
	`id` bigint NOT NULL AUTO_INCREMENT,
	`Nome` varchar(255) NOT NULL,
	`Email` varchar(255) NOT NULL,
	`Senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id`)
);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk0` FOREIGN KEY (`id_categoria`) REFERENCES `Categoria`(`id`);

ALTER TABLE `Produto` ADD CONSTRAINT `Produto_fk1` FOREIGN KEY (`id_usuario`) REFERENCES `Usuário`(`id`);




