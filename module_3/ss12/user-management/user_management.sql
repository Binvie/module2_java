create database user_management;

use user_management;

create table users(
id int(3) not null auto_increment,
name varchar(120) not null,
email varchar(220) not null,
country varchar(120) ,
primary key (id)
);

INSERT INTO `user_management`.`users` (`id`, `name`, `email`, `country`) VALUES ('1', 'Thien', 'thien97.night1@gmail.com', 'Viet Nam');
INSERT INTO `user_management`.`users` (`id`, `name`, `email`, `country`) VALUES ('2', 'Thoi', 'thoisacthoi@gmail.com', 'Viet Nam');
INSERT INTO `user_management`.`users` (`id`, `name`, `email`, `country`) VALUES ('3', 'Nguyen', 'nguyen2trieu@gmail.com', 'Viet Nam');
insert into users(name, email, country) values('Minh','minh@codegym.vn','Viet Nam');
insert into users(name, email, country) values('Kante','kante@che.uk','Kenia');