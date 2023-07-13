use quan_ly;

select order_bill.o_id, order_bill.o_date, product.p_price
from order_bill
join order_detail on order_detail.o_id = order_bill.o_id
join product on product.p_id = order_detail.p_id;
 
-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được  mua  bởi các khách

select customer.c_name, product.p_name, order_detail.order_quantity
from customer
join order_bill on order_bill.c_id = customer.c_id
join order_detail on order_detail.o_id = order_bill.o_id
join product on product.p_id =  order_detail.p_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select customer.c_name
from customer
left join order_bill on order_bill.c_id = customer.c_id
left join order_detail on order_detail.o_id = order_bill.o_id
where order_bill.c_id is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn (giá một hóa đơn được tính bằng tổng giá bán 
-- của từng loại mặt hàng xuất hiện trong hóa đơn. Giá bán của từng loại được tính = odQTY*pPrice)

select distinct customer.c_name, order_bill.o_id, order_bill.o_date,  product.p_price, sum(order_detail.order_quantity * product.p_price) as tong_tien
from customer
join order_bill on order_bill.c_id = customer.c_id
join order_detail on order_detail.o_id = order_bill.o_id
join product on product.p_id =  order_detail.p_id
group by customer.c_id;
set sql_mode = 0;