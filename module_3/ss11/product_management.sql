create database product_management;

use product_management;

create table products(
id int auto_increment primary key,
name varchar(45),
price int ,
description varchar(100)
);

INSERT INTO `product_management`.`products` (`id`, `name`, `price`, `description`) VALUES ('1', 'fan', '50', 'thing that make you feel cool');
INSERT INTO `product_management`.`products` (`id`, `name`, `price`, `description`) VALUES ('2', 'chair', '70', 'thing for u to sit');
INSERT INTO `product_management`.`products` (`id`, `name`, `price`, `description`) VALUES ('3', 'table', '120', 'thing for u to work');
INSERT INTO `product_management`.`products` (`id`, `name`, `price`, `description`) VALUES ('4', 'laptop', '500', 'thing for you to sulf web');
INSERT INTO `product_management`.`products` (`id`, `name`, `price`, `description`) VALUES ('5', 'smartphone', '300', 'thing for you to call people');
