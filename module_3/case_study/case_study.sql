create database customer_management;

use customer_management;

create table customers(
 id int auto_increment,
 customer_name varchar(45),
 email varchar(45),
 address varchar(45),
 primary key (id)
);

insert into customers value (1,'thien','thien7.night1@gmail.com','Hue'),
(2,"Thoi","thoi97.night1@gmail.com","dn"),
(3,"Sang","sang97.night1@gmail.com","Hue"),
(4,"Nguyen","nguyen97.night1@gmail.com","qb"),
(5,"Nghia","nghia97.night1@gmail.com","dn");