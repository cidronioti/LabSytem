-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema labsys
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema labsys
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `labsys` DEFAULT CHARACTER SET utf8 ;
USE `labsys` ;

-- -----------------------------------------------------
-- Table `labsys`.`cad_backup`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`cad_backup` (
  `cod_backup` INT(11) NOT NULL AUTO_INCREMENT,
  `nome_backup` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`cod_backup`))
ENGINE = InnoDB
AUTO_INCREMENT = 13
DEFAULT CHARACTER SET = utf8
COMMENT = 'nessa tabela será armazenado os parametros de configuracao do sistema';


-- -----------------------------------------------------
-- Table `labsys`.`cad_horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`cad_horario` (
  `cod_horario` INT(11) NOT NULL AUTO_INCREMENT,
  `hora_inicio` VARCHAR(10) NULL DEFAULT NULL,
  `hora_fim` VARCHAR(10) NULL DEFAULT NULL,
  `n_seg` VARCHAR(80) NULL DEFAULT NULL,
  `n_ter` VARCHAR(80) NULL DEFAULT NULL,
  `n_qua` VARCHAR(80) NULL DEFAULT NULL,
  `n_qui` VARCHAR(80) NULL DEFAULT NULL,
  `n_sex` VARCHAR(80) NULL DEFAULT NULL,
  `n_sab` VARCHAR(80) NULL DEFAULT NULL,
  PRIMARY KEY (`cod_horario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = 'nessa tabela será armazenado os horários de cada monitor';


-- -----------------------------------------------------
-- Table `labsys`.`cad_lista_equipamentos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`cad_lista_equipamentos` (
  `cod_lista_equipamentos` INT(11) NOT NULL AUTO_INCREMENT,
  `data` VARCHAR(10) NULL DEFAULT NULL,
  `monitores` INT(11) NULL DEFAULT NULL,
  `gabinetes` INT(11) NULL DEFAULT NULL,
  `mouses` INT(11) NULL DEFAULT NULL,
  `teclados` INT(11) NULL DEFAULT NULL,
  `nobreaks` INT(11) NULL DEFAULT NULL,
  `carteiras` INT(11) NULL DEFAULT NULL,
  `adaptadores` INT(11) NULL DEFAULT NULL,
  `cabos_rede` INT(11) NULL DEFAULT NULL,
  `cabos_vga` INT(11) NULL DEFAULT NULL,
  `estabilizadores` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`cod_lista_equipamentos`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `labsys`.`cad_maquina`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`cad_maquina` (
  `COD_MAQUINA` VARCHAR(5) NOT NULL,
  `MARCA_MAQUINA` VARCHAR(20) NULL DEFAULT NULL,
  `MODELO_MAQUINA` VARCHAR(20) NULL DEFAULT NULL,
  `NUM_IDENT_MAQUINA` INT(11) NULL DEFAULT NULL,
  `SO_MAQUINA` VARCHAR(50) NULL DEFAULT NULL,
  `PROCESSADOR_MAQUINA` VARCHAR(30) NULL DEFAULT NULL,
  `HD_MAQUINA` VARCHAR(30) NULL DEFAULT NULL,
  `MEMORIA_RAM_MAQUINA` VARCHAR(30) NULL DEFAULT NULL,
  `MEOMORIA_DEDICADA` VARCHAR(30) NULL DEFAULT NULL,
  `MONITOR_MAQUINA` VARCHAR(30) NULL DEFAULT NULL,
  `STATUS_FUNCIONAMENTO` VARCHAR(30) NULL DEFAULT NULL,
  `STATUS_USO` VARCHAR(20) NULL DEFAULT NULL,
  `obs` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`COD_MAQUINA`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `labsys`.`cad_usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`cad_usuario` (
  `COD_USUARIO` VARCHAR(15) NOT NULL,
  `NOME_USUARIO` VARCHAR(100) NULL DEFAULT NULL,
  `DATA_NASC_USUARIO` VARCHAR(10) NULL DEFAULT NULL,
  `PERMISSAO_USUARIO` VARCHAR(20) NULL DEFAULT NULL,
  `SENHA_USUARIO` VARCHAR(256) NULL DEFAULT NULL,
  `TAG` VARCHAR(256) NULL DEFAULT NULL,
  `CURSO_USUARIO` VARCHAR(30) NULL DEFAULT NULL,
  `FOTO_USUARIO` LONGBLOB NULL DEFAULT NULL,
  `LOGIN_USUARIO` VARCHAR(30) NULL DEFAULT NULL,
  `PERIODO_INGRESSO` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`COD_USUARIO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `labsys`.`configuracao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`configuracao` (
  `cod_config` INT(11) NOT NULL AUTO_INCREMENT,
  `porta_com` VARCHAR(20) NULL DEFAULT NULL,
  `boud_rate` VARCHAR(10) NULL DEFAULT NULL,
  `app_key` VARCHAR(256) NULL DEFAULT NULL,
  `app_secret` VARCHAR(256) NULL DEFAULT NULL,
  `token` VARCHAR(256) NULL DEFAULT NULL,
  `configuracaocol` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`cod_config`))
ENGINE = InnoDB
AUTO_INCREMENT = 20
DEFAULT CHARACTER SET = utf8
COMMENT = 'armazena configuracoes da comunicacao serial';


-- -----------------------------------------------------
-- Table `labsys`.`controle_acesso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `labsys`.`controle_acesso` (
  `COD_CONTROLE_ACESSO` INT(11) NOT NULL AUTO_INCREMENT,
  `COD_USUARIO` VARCHAR(10) NULL DEFAULT NULL,
  `COD_MAQUINA` VARCHAR(5) NULL DEFAULT NULL,
  `DATA_ACESSO` VARCHAR(10) NULL DEFAULT NULL,
  `HORA_ENTRADA` VARCHAR(10) NULL DEFAULT NULL,
  `HORA_SAIDA` VARCHAR(10) NULL DEFAULT NULL,
  `NOME_USUARIO` VARCHAR(80) NULL DEFAULT NULL,
  `STATUS_CONTROLE_ACESSO` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`COD_CONTROLE_ACESSO`),
  INDEX `FK_CONTROLE_REFERENCE_CAD_USUA` (`COD_USUARIO` ASC),
  CONSTRAINT `FK_CONTROLE_REFERENCE_CAD_USUA`
    FOREIGN KEY (`COD_USUARIO`)
    REFERENCES `labsys`.`cad_usuario` (`COD_USUARIO`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
