CREATE TABLE `employees` (
  `id` INT AUTO_INCREMENT NOT NULL,
   `first_name` VARCHAR(255) NULL,
   `last_name` VARCHAR(255) NULL,
   `email` VARCHAR(255) NULL,
   `age` INT NULL,
   CONSTRAINT pk_employees PRIMARY KEY (id)
);