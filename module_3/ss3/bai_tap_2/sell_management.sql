create database quan_ly;

use quan_ly;

create table product(
p_id int auto_increment,
p_name varchar(45),
p_price double,
primary key (p_id)
);

insert into product value (1,'May Giat',3),(2,'Tu Lanh',5),(3,'Dieu Hoa',7),(4,'Quat',1),(5,'Bep Dien',2);

create table customer(
c_id int auto_increment,
c_name varchar(45),
c_age int,
primary key (c_id)
);

insert into customer value (1,'Minh Quan',10),(2,'Ngoc Oanh',20),(3,'Hong ha',50);

create table order_bill(
o_id int auto_increment,
c_id int,
o_date date,
o_total_price double,
primary key (o_id),
foreign key (c_id) references  customer(c_id)
);

insert into order_bill value (1, 1, '2006-06-21', null),(2, 2, '2006-06-23', null),(3, 1, '2006-03-16', null);

create table order_detail(
o_id int,
p_id int,
order_quantity int,
primary key (o_id,p_id),
foreign key (p_id) references product(p_id),
foreign key (o_id) references order_bill(o_id)
);

insert into order_detail value (1, 1, 3),(1, 3, 7),(1, 4, 2),(2, 1, 1),(3, 1, 8),(2, 5, 4),(2, 3, 3);

drop database quan_ly;