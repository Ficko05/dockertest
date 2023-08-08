CREATE TABLE IF NOT EXISTS mydatabase.users (
                                                    `id` INT NOT NULL AUTO_INCREMENT,
                                                    `user_name` VARCHAR(45) NULL,
    `user_password` VARCHAR(45) NULL,
    PRIMARY KEY (`id`))
    ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS mydatabase.roles (
                                                    `id` INT NOT NULL,
                                                    `admin` TINYINT NULL DEFAULT 0,
                                                    `users_id` INT NOT NULL,
                                                    PRIMARY KEY (`id`),
                                                    INDEX `fk_roles_users_idx` (`users_id` ASC) VISIBLE,
                                                    CONSTRAINT `fk_roles_users`
                                                        FOREIGN KEY (`users_id`)
                                                            REFERENCES users (`id`)
                                                            ON DELETE NO ACTION
                                                            ON UPDATE NO ACTION)
    ENGINE = InnoDB;
