create database product_management;

use product_management;

create table products(
id int primary key,
product_code varchar(45),
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(100),
product_status varchar(45)
);


INSERT INTO `product_management`.`products` VALUES 
(`1`, `h1`, `Thoi`, `50`,`1`, `hoi diem`, `off`),
(`2`, `h2`, `Mon Linh`, `10`, `1`, `bao luc`, `boomblebee`),
(`3`, `h3`, `Hai`, `100`, `3`, `okay phet`, `single`),
(`4`, `h4`, `Nguyen`, `150`, `6`, `gia`, `on`);

INSERT INTO products values ('1', 'h1', 'thien', '100', '1', 'pretty good', 'available');
INSERT INTO products values ('2', 'h2', 'thi', '50', '1', 'pretty bad', ' not available');
INSERT INTO products values ('3', 'h3', 'thoi', '105', '1', 'pretty good', 'available');
INSERT INTO products values ('4', 'h4', 'nghien', '150', '1', 'pretty good', 'not available');

create index product_idx1 on products(product_code,product_name);

drop index product_idx on products ;

create unique index product_idx on products(product_code);

-- Tạo view lấy về các thông tin: productCode, productName, 
-- productPrice, productStatus từ bảng products.

create view product_view as select product_code, product_name, product_price, product_amount, product_description from products;

select * from product_view;

update product_view
set product_amount = '2'
where product_price = 150;

delimiter //
create procedure show_all_products()
begin
select * from products where product_price >= 100;
end //
delimiter ;

call show_all_products();

delimiter //
create procedure add_new_product()
begin
insert into products value ('6', 'h6','sang','150','3','ok','1');
end//
delimiter ;

call add_new_product();

delimiter //
create procedure edit_product( id1 int , new_name varchar(45))
begin
UPDATE products
    SET product_name = new_name
WHERE id = id1;
end//
delimiter ;
call edit_product(4, 'tt1');

select * from product_view;

delimiter //
create procedure delete_product( id1 int)
begin
delete from products where id = id1;
end//
delimiter ;

call delete_product(4);
