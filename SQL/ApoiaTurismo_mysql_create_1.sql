CREATE TABLE `tb_produto` (
	`id_produto` bigint(255) NOT NULL AUTO_INCREMENT,
	`titulo` varchar(255) NOT NULL,
	`foto` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`preco` DECIMAL NOT NULL,
	`fk_categoria` bigint NOT NULL,
	`fk_usuario` bigint NOT NULL,
	PRIMARY KEY (`id_produto`)
);

CREATE TABLE `tb_categoria` (
	`id_categoria` bigint NOT NULL AUTO_INCREMENT,
	`tipo` varchar(255) NOT NULL,
	`descricao` varchar(255) NOT NULL,
	`regiao` varchar(255) NOT NULL,
	PRIMARY KEY (`id_categoria`)
);

CREATE TABLE `tb_usuario` (
	`id_usuario` bigint NOT NULL AUTO_INCREMENT,
	`nome` varchar(255) NOT NULL,
	`email` varchar(255) NOT NULL,
	`senha` varchar(255) NOT NULL,
	PRIMARY KEY (`id_usuario`)
);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk0` FOREIGN KEY (`fk_categoria`) REFERENCES `tb_categoria`(`id_categoria`);

ALTER TABLE `tb_produto` ADD CONSTRAINT `tb_produto_fk1` FOREIGN KEY (`fk_usuario`) REFERENCES `tb_usuario`(`id_usuario`);




