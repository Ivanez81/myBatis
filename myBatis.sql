DROP DATABASE IF EXISTS mybatis_testdb;
CREATE DATABASE IF NOT EXISTS mybatis_testdb DEFAULT CHARACTER SET utf8 DEFAULT COLLATE utf8_general_ci;

CREATE TABLE `mybatis_testdb`.`user` (
  `id` CHAR(36) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
  
CREATE TABLE `mybatis_testdb`.`role` (
  `id` CHAR(36) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));  
  
  CREATE TABLE `mybatis_testdb`.`position` (
  `id` CHAR(36) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`));
  
ALTER TABLE `mybatis_testdb`.`user` 
ADD INDEX `fk_user_role_idx` (`role_id` ASC);

ALTER TABLE `mybatis_testdb`.`user` 
ADD CONSTRAINT `fk_user_role`
  FOREIGN KEY (`role_id`)
  REFERENCES `mybatis_testdb`.`role` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;
  
ALTER TABLE `mybatis_testdb`.`user` 
ADD INDEX `fk_user_position_idx` (`position_id` ASC);

ALTER TABLE `mybatis_testdb`.`user` 
ADD CONSTRAINT `fk_user_position`
  FOREIGN KEY (`position_id`)
  REFERENCES `mybatis_testdb`.`position` (`id`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;