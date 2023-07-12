create database quan_ly;

use quan_ly;
create table order_detail(
o_id int auto_increment,
p_id int auto_increment,
order_quantity int,
primary key (o_id,p_id)
);

create table product(
p_id int,
p_name varchar(45),
p_price double,
foreign key (p_id) references order_detail(p_id)
);

create table order_bill(
o_id int,
c_id int,
o_date date,
o_total_price double,
foreign key (o_id) references order_detail(o_id)
);

create table customer(
c_id int,
c_name varchar(45),
c_age int
);